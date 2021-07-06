package thread;

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + "运行，i = " + i);
        }
    }
}

public class Thread01 {

    private int b = 0;

    private static class MyThread extends Thread {
        private String name;
        int a = 0;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(name + "运行，a = " + a);
                a++;
            }
        }
    }

    /*
     * 一个thread对象是一个程序中运行的一个线程，JVM允许一个应用由多个线程同时运行
     * 每个线程都有优先级，优先级高的线程先运行
     * */

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程A ");
        MyThread myThread2 = new MyThread("线程B ");
        MyThread myThread3 = new MyThread("线程C ");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

    /*
     * 一个thread对象是一个程序中运行的一个线程，JVM允许一个应用由多个线程同时运行
     * 每个线程都有优先级，优先级高的线程先运行
     * */

}
