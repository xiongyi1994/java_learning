package leetcode;

/**
 * describe: 最小深度
 *
 * 深度优先遍历
 */
public class Ex111 {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {

  }

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    } else if (root.left != null && root.right != null) {
      return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    } else if (root.left == null && root.right != null) {
      return minDepth(root.right) + 1;
    } else if (root.left != null && root.right == null) {
      return minDepth(root.left) + 1;
    } else {
      return 1;
    }
  }

}
