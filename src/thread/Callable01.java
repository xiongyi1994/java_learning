package thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 实现Callable接口可以创建接口
* 相较于实现Runnable接口的方式，方法可以有返回值，并且可以抛出异常
*
* 执行Callable方式，需要FutureTask实现类的支持，用于接受运算结果
* */

public class Callable01 {
    public static void main(String[] args) {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        new Thread(futureTask).start();
        try {
            Thread.sleep(5000); // 可能做一些事情
            System.out.println(futureTask.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
