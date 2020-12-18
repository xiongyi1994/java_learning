package lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 乐观锁 悲观锁
 *
 * 乐观锁认为自己在使用数据时不会有别的线程修改数据，所以不会添加锁
 * 只是在更新数据的时候取判断之前有没有别的线程更新了这个数据
 * 如果这个数据没有被更新，当前线程将自己修改的数据成功写入
 * 如果数据已经被其他线程更新，则根据不同的实现方式执行不同的操作（报错或者重试）
 * CAS算法
 *
 * 对于同一个数据的并发操作，悲观锁认为自己在使用数据的时候一定有别的线程来修改数据
 * 因此在获取数据的时候会先加锁，确保数据不会被别的线程修改。
 * synchronized lock都是悲观锁
 *
 * **/
public class Lock01 {

    private void optimistic() {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }

    private void pessimistic() {

    }

}
