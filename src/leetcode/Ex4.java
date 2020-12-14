package leetcode;

/**
 * describe: 寻找两个有序数组的中位数
 *
 */
public class Ex4 {

  public static void main(String[] args) {
    Ex4 ex4 = new Ex4();
    int[] a = {1,2};
    int[] b = {3,4};
    System.out.println(ex4.findMedianSortedArrays(a,b));
  }

  /**
   * 合并两个数组
   * 时间 85.26
   * 空间 99.6
   * **/
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i = 0, j = 0, k = 0;
    int[] t = new int[nums1.length + nums2.length];
    while (k < t.length) {
      if (j > nums2.length - 1) {
        t[k] = nums1[i];
        i++;
        k++;
        continue;
      }
      if (i > nums1.length - 1) {
        t[k] = nums2[j];
        j++;
        k++;
        continue;
      }
      if (nums1[i] > nums2[j]) {
        t[k] = nums2[j];
        j++;
      } else {
        t[k] = nums1[i];
        i++;
      }
      k++;
    }
    if (t.length % 2 == 0) {
      return (float) (t[t.length/2 - 1] + t[t.length/2]) / 2;
    } else {
      return (float) t[t.length/2];
    }
  }

  /**
   * 递归二分
   * **/

}
