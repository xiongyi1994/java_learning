package leetcode;

/**
 * describe: 合并两个有序链表
 */
public class Ex21 {

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    return null;
  }

  private void merge(ListNode l1, ListNode l2) {
    ListNode temp;
    if (l1.val > l2.val) {
      temp = l2.next;
      l2.next = l1;
    } else {

    }
  }

}
