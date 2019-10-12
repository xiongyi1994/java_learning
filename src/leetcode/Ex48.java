package leetcode;

/**
 * describe: 旋转图像
 *
 */
public class Ex48 {

  public static void main(String[] args) {

  }

  public void rotate(int[][] matrix) {
    // 先转置
    for (int i = 0; i< matrix.length; i++) {
      for (int j= i; j < matrix[0].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // 再每行翻转
    for (int i = 0; i< matrix.length; i++) {
      for (int j = 0; j < matrix[0].length / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
        matrix[i][matrix[0].length - 1 - j] = temp;
      }
    }
  }

}
