package lock;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.LockSupport;

/**
 * describe:
 *
 * @author xiongyi
 * @date 2021/01/01
 */
public class MyLock {

    /**
     * 当前加锁状态，记录加锁次数
     **/
    private volatile int state = 0;

    private Thread lockHolder;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Thread getLockHolder() {
        return lockHolder;
    }

    public void setLockHolder(Thread lockHolder) {
        this.lockHolder = lockHolder;
    }

    private ConcurrentLinkedQueue<Thread> queue = new ConcurrentLinkedQueue<>();

    private boolean tryAquire() {
        Thread thread = Thread.currentThread();
        int state = getState();
        if (state == 0) {
            if ((queue.size() == 0 || thread == queue.peek()) && compareAndSwapState(0, 1)) {
                setLockHolder(thread);
                return true;
            }
        }
        return false;
    }

    public void lock() {
        // 1、获取锁 CAS compare and swap
        if (tryAquire()) {
            return;
        }

        Thread currentThread = Thread.currentThread();
        queue.add(currentThread);
        // 2、停留在当前方法
        for (; ; ) {
            if (queue.peek() == currentThread && tryAquire()) {
                System.out.println("hold lock Thread-name:" + currentThread.getName());
                return;
            }
            // 阻塞线程
            LockSupport.park(currentThread);
        }

        // 3、被释放后，再次获取锁
    }

    /**
     * 解锁
     **/
    public void unlock() {
        Thread currentThread = Thread.currentThread();
        if (Thread.currentThread() != lockHolder) {
            throw new RuntimeException("你不是持有锁的线程，不可以释放锁");
        }

        int state = getState();

        if (compareAndSwapState(1, 0)) {
            System.out.println(String.format("Thread-name: %s , 释放锁成功", currentThread.getName()));
            setLockHolder(null);
            Thread thread = queue.peek();
            if (thread != null) {
                LockSupport.unpark(thread);
            }
        }
    }

    private static final Unsafe UNSAFE = getUnsafe();

    private static final long stateOffset;

    public final boolean compareAndSwapState(int oldValue, int newValue) {
        return UNSAFE.compareAndSwapInt(this, this.stateOffset, oldValue, newValue);
    }

    static {
        try {
            stateOffset = UNSAFE.objectFieldOffset(MyLock.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            throw new Error();
        }
    }

    public static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            return null;
        }
    }
}
