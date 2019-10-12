package leetcode;

/**
 * describe: 回文链表
 *
 */
public class Ex234 {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      this.val = x;
    }
  }

  public static void main(String[] args) {
    Ex234 ex234 = new Ex234();
    ListNode listNode = new ListNode(10);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(10);
    System.out.println(ex234.isPalindrome(listNode));
  }

  /**
   * 快慢指针
   *
   *
   */
  public boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (head.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    // 快指针nex为空，说明链表为奇数链表
    if (fast.next == null) {

    } else {
      // 链表为偶数链表

    }
    return true;
  }

}
