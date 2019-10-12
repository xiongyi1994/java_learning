package leetcode;

/**
 * describe: 回文数
 *
 * 所有负数都不是回文数
 *
 */
public class Ex9 {

  public static void main(String[] args) {
    Ex9 nine = new Ex9();
    System.out.println(nine.isPalindrome01(121));
    System.out.println(nine.isPalindrome01(-121));
    System.out.println(nine.isPalindrome01(-1211));
  }

  /**
   * 转换为字符串来解决
   *
   */
  public boolean isPalindrome01(int x) {
    String s = String.valueOf(x);
    boolean flag = true;
    for (int i = 0; i < s.length(); i++) {
      if (i >= s.length() / 2) {
        break;
      }
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        flag = false;
        break;
      }
    }
    return flag;
  }

}
