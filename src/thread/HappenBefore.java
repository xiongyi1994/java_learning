package thread;

/**
 * 指令重排
 * <p>
 * 为了使得处理器内部的运算单元能尽量被充分利用，处理器可能会对输入代码进行乱序执行（Out-Of-Order Execution）优化，处
 * 理器会在计算之后将乱序执行的结果重组，保证该结果与顺序执行的结果是一致的，但并不保证程序中各个语句计算的先后顺序与输入代码中的顺序一致。
 * <p>
 * 因此，如果存在一个计算任务依赖另一个计算任务的中间结果，那么其顺序性并不能靠代码的先后顺序来保证。
 * 与处理器的乱序执行优化类似，Java虚拟机的即时编译器中也有类似的指令重排序（Instruction Reorder）优化
 **/
public class HappenBefore {
    private static int i = 0, j = 0;
    private static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {
        while (true) {

            i = 0;
            j = 0;
            a = 0;
            b = 0;

            Thread t1 = new Thread(() -> {
                a = 1;
                i = b;
            });

            Thread t2 = new Thread(() -> {
                b = 1;
                j = a;
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("i = " + i + " ; j = " + j);
            if (i == 0 && j == 0) {
                break;
            }
        }
    }
}
