package leetcode;

/**
 * describe: 相同的树
 *
 * 时间 100
 * 空间 85.65
 */
public class Ex100 {

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

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if ((p == null && q != null)||(p != null && q== null)) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }
    return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
  }

}
