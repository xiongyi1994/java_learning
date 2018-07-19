package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * describe:
 *
 * @author xiongyi
 * @date 2018/07/17
 */
public class ThreadLocalLearning {

  /*
  * ThreadLocal 提供 thread-local变量
  *
  * */

  static private class ThreadId {

    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId =
      new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
          return nextId.getAndIncrement();
        }
      };

    public static int get() {
      return threadId.get();
    }

  }

  public static void main(String[] args) {
    System.out.println(ThreadId.get());
  }

}
