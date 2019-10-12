package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * describe: 四数之和
 *
 */
public class Ex18 {

  public static void main(String[] args) {
    Ex18 ex18 = new Ex18();
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    System.out.println(ex18.fourSum(nums, target).toString());
  }

  /**
   * 暴力
   *
   **/
  public List<List<Integer>> fourSum(int[] nums, int target) {
    if (nums.length < 4) {
      return Collections.emptyList();
    }
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        for (int k = j+1; k < nums.length; k++) {
          for (int n = k+1; n < nums.length; n++) {
            if (nums[i] + nums[j] + nums[k] + nums[n] == target) {
              List<Integer> a = new ArrayList<>();
              a.add(nums[i]);
              a.add(nums[j]);
              a.add(nums[k]);
              a.add(nums[n]);
              result.add(a);
            }
          }
        }
      }
    }
    return result;
  }

}
