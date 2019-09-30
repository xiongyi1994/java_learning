/*
package tree.black_red_tree;

*/
/**
 *
 * 红黑树定义
 * 1、节点是红色或者黑色
 * 2、根节点是黑色
 * 3、所有叶子节点都是黑色NIL节点
 * 4、红色节点左右子节点都为黑色
 * 5、从所有叶子结点到根节点的最简单路径上的黑色节点的数目是一致的
 *
 *//*

public class BlackRedTree {

  static class TreeNode {

    TreeNode parent;
    TreeNode left;
    TreeNode right;
    TreeNode prev;
    boolean red;

    TreeNode() {

    }

    TreeNode root() {

      for (TreeNode r = this, p;;) {
        p = r.parent;
        if (p == null) {
          return r;
        }
        r = p;
      }
    }

    TreeNode putTreeVal() {
      TreeNode root = parent != null ? root() : this;

    }

    static TreeNode balanceInsertion() {

    }

    static TreeNode rotateLeft(TreeNode root, TreeNode p) {

    }

  }

  public static void main(String[] args) {
    BlackRedTree blackRedTree = new BlackRedTree();
  }

}
*/
