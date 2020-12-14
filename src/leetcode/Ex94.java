package leetcode;

import javafx.scene.transform.Rotate;

import java.util.ArrayList;
import java.util.List;

/**
 * describe: 二叉树的中序遍历
 *
 */
public class Ex94 {

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

  /**
   * 递归
   * 时间97.32
   * 空间39.57
   * **/
  List<Integer> result = new ArrayList<>();
  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) {
      return result;
    }
    if (root.left != null) {
      inorderTraversal(root.left);
    }
    result.add(root.val);
    if (root.right != null) {
      inorderTraversal(root.right);
    }
    return result;
  }

}
