package basic.data.type;

/**
 * describe:
 *
 * @author yi.xiong3@renren-inc.com
 * @date 2019/10/12
 */
public class FloatLearning {

  public static void main(String[] args) {
    new FloatLearning().FloatWrapperClass();
  }

  public void FloatWrapperClass() {
    Float f1 = 1.1f;
    Float f2 = 1.1f;
    Float f3 = new Float(1.1f);
    System.out.println(f1 == f2);
    System.out.println(f1 == f3);
  }

}
