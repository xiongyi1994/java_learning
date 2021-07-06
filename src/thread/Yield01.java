package thread;

/**
 * @author xiongyi
 */
public class Yield01 extends Thread {

    public Yield01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            if (i == 30) {
                Thread.yield();
            }
        }
    }

    /**
     * thread.yield();
     * 当一个线程使用了这个方法之后，它就会把自己CPU执行的时间让掉，让自己或者其它的线程运行。
     */
    public static void main(String[] args) {
        Yield01 yt1 = new Yield01("张三");
        Yield01 yt2 = new Yield01("李四");
        yt1.start();
        yt2.start();
    }
}
