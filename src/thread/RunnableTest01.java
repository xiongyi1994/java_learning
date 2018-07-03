package thread;

public class RunnableTest01 {
    /*
    * 测试操作符 ++ 是不是线程安全的
    *
    * 结论 ++ 不是线程安全的
    * */

    static class Test implements Runnable {

        int a =0;

        @Override
        public void run() {
            ++a;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Test m1 = new Test();
        Test m2 = new Test();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
