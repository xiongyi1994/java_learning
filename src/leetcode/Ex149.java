package leetcode;

import java.util.TreeMap;

/**
 * describe: 直线上最多的点数
 *
 */
public class Ex149 {

  public static void main(String[] args) {

  }

  public int maxPoints(int[][] points) {
    if (points.length < 2) {
      return points.length;
    }
    int result = 1;
    for (int i = 0; i < points.length; i++) {
      result = 1;
      for (int j = i + 1; j < points.length; j++) {
        float k;
        if (points[j][1] == points[i][1] && points[j][0] == points[i][0]) {
          result++;
          continue;
        }
        if ((points[j][0] - points[i][0]) == 0) {
          k = 0;
        } else {
          k = (float) (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
        }
        int round = 0;
        for (int m = 0; m < points.length; m++) {
          if ((points[m][0] == points[i][0] && points[m][1] == points[i][1])
              || (points[m][0] == points[j][0] && points[m][1] == points[j][1])) {
            round++;
          } else if ((points[m][0] - points[j][0]) == 0 && k == 0) {
            round++;
          } else if (k == (float) (points[m][1] - points[j][1]) / (points[m][0] - points[j][0])) {
            round++;
          }
        }
        if (round > result) {
          result = round;
        }
      }
    }

    return result;
  }

}
