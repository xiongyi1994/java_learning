package leetcode;

/**
 * describe: 汉明距离
 *
 * 两个数字二进制位不同位置的数目
 *
 * 4(10) = 100(2)
 * 1(10) = 001(2)
 * 5(10) = 101(2)
 * 6(10) = 110(2)
 */
public class Ex461 {

  public static void main(String[] args) {
    Ex461 ex461 = new Ex461();
    System.out.println(ex461.hammingDistance(5, 6));
  }

  /**
   * 位运算
   * 时间 100
   * 空间 77.38
   * **/
  public int hammingDistance(int x, int y) {
    int result = 0;
    while (x > 0 || y > 0) {
      if (x % 2 != y % 2) { // 此处可以改进， 使用异或运算
        result++;
      }
      x = x >> 1;
      y = y >> 1;
    }
    return result;
  }

}
