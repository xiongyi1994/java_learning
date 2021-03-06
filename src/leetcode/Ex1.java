package leetcode;

/**
 * describe: 两数之和
 *
 */
public class Ex1 {

  /**
   * 暴力
   * 时间复杂度O(n^2)
   * **/
  public int[] twoSum(int[] nums, int target) {
    int a = 0, b = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j]) {
          a = i;
          b = j;
          break;
        }
      }
    }
    return new int[]{a, b};
  }

  /**
   * 哈希表 hashmap
   * 空间换时间
   * **/
  public int[] twoSum02(int[] nums, int target) {
    return null;
  }

}
