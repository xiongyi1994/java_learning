package leetcode;

/**
 * describe: 最长回文子串
 *
 * @author yi.xiong3@renren-inc.com
 * @date 2019/09/29
 */
public class Five {

  public static void main(String[] args) {
    String test = "ab";
    Five five = new Five();
    System.out.println(five.longestPalindrome(test));
  }

  /**
   * 中心扩展
   */
  public String longestPalindrome(String s) {
    StringBuilder new_s = new StringBuilder();
    new_s.append("*");
    for (int i = 0; i < s.length(); i++) {
      new_s.append(s.charAt(i)).append("*");
    }
    s = new_s.toString();
    int result = 0;
    int index = 0;
    for (int i = 0; i < s.length(); i++) {
      int length = 1;
      while(true) {
        if (i - length < 0 || i + length >= s.length()) {
          if (length > result) {
            index = i;
            result = length - 1;
          }
          break;
        }
        if (s.charAt(i-length) == s.charAt(i+length)) {
          length++;
          continue;
        } else{
          if (length > result) {
            index = i;
            result = length - 1;
          }
          break;
        }
      }
    }
    return s.substring(index - result, index + result + 1).replace("*", "");
  }

  /**
   * 动态规划
   */
  public String longestPalindrome_02(String s) {
    return null;
  }

}
