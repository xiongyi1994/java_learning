package leetcode;

/**
 * describe: Z字形变换
 *
 */
public class Six {

  public static void main(String[] args) {
    Six six = new Six();
    String test = "A";
    int numRows = 2;
    System.out.println(six.convert(test, numRows));
  }

  public String convert(String s, int numRows) {
    if ("".equals(s)) {
      return "";
    }
    if (numRows == 1 || numRows > s.length()) {
      return s;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      sb.append(s.charAt(i));
      int b_index = i + 2*(numRows-1);
      int a_index = b_index - 2*i;
      while (true) {
        if (a_index >= s.length()) {
          break;
        }
        if (a_index >= numRows && i != 0 && i != numRows - 1) {
          sb.append(s.charAt(a_index));
        }
        if (b_index >= s.length()) {
          break;
        }
        sb.append(s.charAt(b_index));
        b_index += 2*(numRows-1);
        a_index = b_index - 2*i;
      }
    }
    return sb.toString();
  }

}
