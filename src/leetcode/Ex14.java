package leetcode;

/**
 * describe: 最长公共前缀
 *
 */
public class Ex14 {

  public static void main(String[] args) {
    Ex14 ex14 = new Ex14();
    System.out.println(ex14.longestCommonPrefix(new String[]{"flower","flow","flight"}));
  }

  /**
   * 强行搞逻辑
   * 时间 97.58
   * 空间 73.83
   * **/
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    int minLength = Integer.MAX_VALUE, minIndex = 0;
    for (int i = 0; i < strs.length; i++) {
      if (minLength > strs[i].length()) {
        minLength = strs[i].length();
        minIndex = i;
      }
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (int k = 0; k < minLength; k++) {
      char c = strs[minIndex].charAt(k);
      boolean eq = true;
      for (int m = 0; m < strs.length; m++) {
        if (strs[m].charAt(k) != c) {
          eq = false;
          break;
        }
      }
      if (eq) {
        stringBuilder.append(c);
      } else {
        break;
      }
    }
    return stringBuilder.toString();
  }

}
