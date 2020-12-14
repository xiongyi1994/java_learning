package leetcode;

/**
 * describe: 反转链表
 *
 */
public class Ex206 {

  static class  ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {

  }

  /**
   * 时间 100
   * 空间 42.54
   * **/
  public ListNode reverseList(ListNode head) {
    ListNode rev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = rev;
      rev = curr;
      curr = temp;
    }
    return rev;
  }

}
