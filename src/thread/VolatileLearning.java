package thread;

/**
 * describe:
 *
 * volatile 可以保证主内存中的变量的可见性
 * 当某一个线程修改了从主内存中读取的数据后，其它线程通过监听主线，可以立即使当前线程工作内存中的变量失效，重新去读取主内存的数据
 *
 * 缓存一致性
 *
 * @author xiongyi
 * @date 2020/07/20
 */
public class VolatileLearning {

    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("线程 " + Thread.currentThread().getName() + " 开始执行！");
                while (flag) {
//                    System.out.println("死循环");
                }
                System.out.println("线程 " + Thread.currentThread().getName() + " 结束执行！");
            }
        }).start();

        Thread.sleep(1000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程 " + Thread.currentThread().getName() + " 开始执行！");
                flag = false;
                System.out.println("线程 " + Thread.currentThread().getName() + " 结束执行！");
            }
        }).start();

    }

}
