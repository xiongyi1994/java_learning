package leetcode;

/**
 * describe: 二叉树最大深度
 *
 * 深度优先遍历
 *
 */
public class Ex104 {

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {

  }

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    } else if (root.left != null && root.right != null) {
      return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    } else if (root.left == null && root.right != null) {
      return maxDepth(root.right) + 1;
    } else if (root.left != null && root.right == null) {
      return maxDepth(root.left) + 1;
    } else {
      return 1;
    }
  }

}
