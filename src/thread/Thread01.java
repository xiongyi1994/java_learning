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

    /*
     * 一个thread对象是一个程序中运行的一个线程，JVM允许一个应用由多个线程同时运行
     * 每个线程都有优先级，优先级高的线程先运行
     * */

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程A ");
        MyThread myThread2 = new MyThread("线程B ");
        myThread1.start();
        myThread2.start();
    }

}
