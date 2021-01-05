package thread;

/**
 * NEW Thread state for a thread which has not yet started.
 *
 * RUNNALBE Thread state for a runnable thread.
 *
 * BLOCKED Thread state for a thread blocked waiting for a monitor lock.
 *
 * WAITING Thread state for a waiting thread.
 *
 * TIMED_WAITING Thread state for a waiting thread with a specified waiting time.
 *
 * TERMINATED Thread state for a terminated thread.
 **/
public class ThreadState {

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run " + Thread.currentThread().getState()); // RUNNABLE

                synchronized (lock) {
                    System.out.println("线程1开始跑");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1睡完了");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2开始跑 " + Thread.currentThread().getState());
                synchronized (lock) {
                    System.out.println("线程2跑啊跑");
                }
                System.out.println("线程2结束了");
            }
        });

        System.out.println("new " + thread.getState()); // NEW

        thread.start();
        Thread.sleep(1000);
        thread2.start();

        System.out.println("after start " + thread.getState()); // RUNNABLE
//        System.out.println("线程1启动后，线程2阻塞 " + thread2.getState());

        while (Thread.State.RUNNABLE == thread2.getState()) {
            System.out.println("线程1启动后，线程2阻塞 " + thread2.getState());
        }
        System.out.println("线程1启动后，线程2阻塞 " + thread2.getState()); // BLOCKED

    }

}
