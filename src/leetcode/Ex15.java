package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * describe: 三数之和
 *
 */
public class Ex15 {

  public static void main(String[] args) {

  }

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, Integer> valueAndNum = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (valueAndNum.get(nums[i]) == null) {
        valueAndNum.put(nums[i], 0);
      } else {
        valueAndNum.put(nums[i], valueAndNum.get(nums[i]) + 1);
      }
    }
    for (int i = 0; i < nums.length - 2; i++) {
      for (int k = i+1; k < nums.length - 1; k++) {
        if (valueAndNum.get(-nums[i]-nums[k]) != null && valueAndNum.get(-nums[i]-nums[k]) > 0) {
          if ((-nums[i]-nums[k] == nums[i] || -nums[i]-nums[k] == nums[k]) && valueAndNum.get(-nums[i]-nums[k]) > 1) {
            List<Integer> round = new ArrayList<>();
            round.add(nums[i]);
            round.add(nums[k]);
            round.add(-nums[i]-nums[k]);
            result.add(round);
          }
        }
      }
    }
    return result;
  }

}
