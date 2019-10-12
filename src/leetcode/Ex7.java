package leetcode;

/**
 * describe: 整数反转
 *
 * 需要考虑的问题：溢出
 */
public class Ex7 {

  public static void main(String[] args) {
    Ex7 seven = new Ex7();
    int a = -12111;
    System.out.println(Integer.MAX_VALUE); // 2147483647
    System.out.println(seven.reverse01(a));
  }

  public int reverse01(int x) {
    long result = 0;
    while (x != 0) {
      int pop = x % 10;
      result = result * 10 + pop;
      if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        return 0;
      }
      x = x / 10;
    }
    return (int) result;
  }

}
