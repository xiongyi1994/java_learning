package leetcode;

/**
 * describe: 整数转罗马数字
 *
 */
public class Ex12 {

  public static void main(String[] args) {
    Ex12 ex12 = new Ex12();
    System.out.println(ex12.intToRoman(1000));
  }

  /**
   * 强行搞逻辑
   * 时间96.59
   * 空间100
   * **/
  public String intToRoman(int num) {
    StringBuilder stringBuilder = new StringBuilder();
    while(num != 0) {
      if (num >= 1000) {
        int m_num = num / 1000;
        while (m_num > 0) {
          stringBuilder.append("M");
          m_num--;
        }
        num = num % 1000;
      } else if (num > 500) {
        int d_num = num / 100;
        if (d_num == 9) {
          stringBuilder.append("CM");
        } else {
          stringBuilder.append("D");
          d_num = d_num - 5;
          while (d_num > 0) {
            stringBuilder.append("C");
            d_num--;
          }
        }
        num = num % 100;
      } else if (num <= 500 && num >= 100) {
        int c_num = num / 100;
        if (c_num == 5) {
          stringBuilder.append("D");
        } else if (c_num == 4) {
          stringBuilder.append("CD");
        } else {
          while (c_num > 0) {
            stringBuilder.append("C");
            c_num--;
          }
        }
        num = num % 100;
      } else if (num > 50) {
        int x_num = num / 10;
        if (x_num == 9) {
          stringBuilder.append("XC");
        } else {
          x_num = x_num - 5;
          stringBuilder.append("L");
          while (x_num > 0) {
            stringBuilder.append("X");
            x_num--;
          }
        }
        num = num % 10;
      } else if (num <= 50 && num >=10) {
        int x_num = num / 10;
        if (x_num == 5) {
          stringBuilder.append("L");
        } else if (x_num == 4) {
          stringBuilder.append("XL");
        } else {
          while (x_num > 0) {
            stringBuilder.append("X");
            x_num--;
          }
        }
        num = num % 10;
      } else if (num > 5) {
        int i_num = num;
        if (i_num == 9) {
          stringBuilder.append("IX");
        } else {
          stringBuilder.append("V");
          i_num = i_num - 5;
          while (i_num > 0) {
            stringBuilder.append("I");
            i_num--;
          }
        }
        break;
      } else if (num >= 1 && num <=5) {
        if (num == 5) {
          stringBuilder.append("V");
        } else if (num == 4) {
          stringBuilder.append("IV");
        } else {
          while (num > 0) {
            stringBuilder.append("I");
            num--;
          }
        }
        break;
      }
    }
    return stringBuilder.toString();
  }

}
