package innnerClass;

/**
 * describe:
 *
 * @author yi.xiong3@renren-inc.com
 * @date 2019/09/23
 */
public class InnerClassLearning01 {

  static class Father {
    private int i;
    private String s;
  }

  static class Child extends Father {

  }

  public static void main(String[] args) {
    Child child = new Child();
  }

}
