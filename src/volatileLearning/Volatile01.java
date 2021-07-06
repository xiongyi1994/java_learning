package volatileLearning;

public class Volatile01 {

    private static volatile boolean end = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
                while (end) {
                    // sout里面使用了 synchronized 所以相当于 volatile 修改类变量
                    //System.out.println("running!");
                }
                System.out.println("stop");
            }
        }).start();

        Thread.sleep(1000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                end = false;
            }
        }).start();
    }

}
