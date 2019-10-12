package leetcode;

/**
 * describe: 字符串转换整数
 *
 */
public class Ex8 {

  public static void main(String[] args) {
    System.out.println('1' >= 48);
    System.out.println('1' <= 57);
    System.out.println(new Ex8().myAtoi("20000000000000000000"));
  }

  public int myAtoi(String str) {
    if (str == null) {
      return 0;
    }
    str = str.trim();
    if (str.length() == 0) {
      return 0;
    }
    char firstChar = str.charAt(0);
    if (firstChar != '-' && firstChar != '+' && (firstChar < 48 || firstChar > 57)) {
      return 0;
    }
    String s = "";
    for (int i = 0; i < str.length(); i++) {
      if (i == 0 && (str.charAt(0) == '-' || str.charAt(0) == '+')) {
        s += str.charAt(i);
      } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
        s += str.charAt(i);
      } else {
        break;
      }
    }
    if ("+".equals(s) || "-".equals(s)) {
      return 0;
    }
    long result = 0;
    try {
      result = Long.parseLong(s);
    } catch (NumberFormatException ignored) {
      if (s.length() > String.valueOf(Integer.MIN_VALUE).length() && s.charAt(0) == '-') {
        return Integer.MIN_VALUE;
      }
      if (s.length() > String.valueOf(Integer.MAX_VALUE).length()) {
        return Integer.MAX_VALUE;
      }
      return 0;
    }
    if (result > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }
    if (result < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    }
    return (int) result;
  }

}
