package leetcode;

/**
 * describe: 盛最多水的容器
 *
 */
public class Ex11 {

  public static void main(String[] args) {
    Ex11 ex11 = new Ex11();
    System.out.println(ex11.maxArea2(new int[]{1,8,6,2,5,4,8,3,7}));
  }

  /**
   * 暴力解决
   * 时间 31.43
   * 空间 92.78
   * **/
  public int maxArea(int[] height) {
    int result = 0;
    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int round = (j - i) * Math.min(height[i], height[j]);
        if (round > result) {
          result = round;
        }
      }
    }
    return result;
  }

  /**
   * 双指针
   * 时间 92.61
   * 空间 92.27
   * **/
  public int maxArea2(int[] height) {
    int low = 0, high = height.length - 1;
    int result = 0;
    while (low != high) {
      int round = (high - low) * Math.min(height[low], height[high]);
      if (round > result) {
        result = round;
      }
      if (height[low] > height[high]) {
        high--;
      } else {
        low++;
      }
    }
    return result;
  }

}
