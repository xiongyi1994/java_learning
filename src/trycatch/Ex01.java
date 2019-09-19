package trycatch;

/**
 * describe:
 *
 * @author yi.xiong3@renren-inc.com
 * @date 2019/08/26
 */
public class Ex01 {

  public static void main(String[] args) {
    System.out.println(new Ex01().foo());
  }

  public String foo () {
    try {
      int a = 9 / 0;
    } catch (Exception e) {
      return "catch";
    } finally {
      return "finally";
    }
  }

}
