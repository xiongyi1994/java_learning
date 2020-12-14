package leetcode;

/**
 * describe: 实现 strStr()
 *
 * @author yi.xiong3@renren-inc.com
 * @date 2020/01/03
 */
public class Ex28 {

  public static void main(String[] args) {
    Ex28 ex28 = new Ex28();
    System.out.println(ex28.strStr("a", "a"));
  }

  /**
   * 遍历
   * **/
  public int strStr(String haystack, String needle) {
    // 特殊情况处理
    if ("".equalsIgnoreCase(needle)) {
      return 0;
    }
    if (needle.length() > haystack.length()) {
      return -1;
    }
    boolean match = true;
    for (int i = 0; i < haystack.length(); i++) {
      if (needle.charAt(0) == haystack.charAt(i) && haystack.length() - i >= needle.length()) {
        for (int k = 0; k < needle.length(); k++) {
          if (needle.charAt(k) != haystack.charAt(i + k)) {
            match = false;
            break;
          }
        }
        if (match) {
          return i;
        }
      }
    }
    return -1;
  }

}
