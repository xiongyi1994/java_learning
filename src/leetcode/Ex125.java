package leetcode;

/**
 * describe: 验证回文串
 *
 */
public class Ex125 {

  public static void main(String[] args) {
    Ex125 ex125 = new Ex125();
    System.out.println(ex125.isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(ex125.isPalindrome("race a car"));
    System.out.println(ex125.isPalindrome("`l;`` 1o1 ??;l`"));
  }

  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return Boolean.FALSE;
      }
    }
    return Boolean.TRUE;
  }

}
