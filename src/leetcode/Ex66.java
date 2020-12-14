package leetcode;

import java.util.Arrays;

/**
 * describe: 加一
 *
 */
public class Ex66 {

  public static void main(String[] args) {
    Ex66 ex66 = new Ex66();
    System.out.println(Arrays.toString(ex66.plusOne(new int[]{9, 9, 9})));
  }

  /**
   * 遍历
   * **/
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      int sum = digits[i] + 1;
      if (sum != 10) {
        digits[i] = sum;
        break;
      }
      digits[i] = 0;
      if (i != 0) {
        digits[i - 1] = digits[i - 1]++;
      } else {
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
      }
    }
    return digits;
  }

}
