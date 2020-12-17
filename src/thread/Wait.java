package thread;

/**
 * describe:
 *
 * @author xiongyi
 * @date 2020/12/17
 */
public class Wait {

    static class Thread1 extends Thread {

        private Object lock;

        public Thread1(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println(getName() + " running.");
                    lock.wait();
                    System.out.println(getName() + " notified.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    static class Thread2 extends Thread {

        private Object lock;

        public Thread2(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(getName() + " running.");
                lock.notify();
                System.out.println(getName() + " end.");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Thread1 thread1 = new Thread1(lock);
        Thread2 thread2 = new Thread2(lock);

        thread1.start();

        Thread.sleep(2000);

        thread2.start();

    }

}
