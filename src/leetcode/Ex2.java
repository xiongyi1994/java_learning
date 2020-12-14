package leetcode;

/**
 * describe: 两数相加
 *
 */
public class Ex2 {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    } else if (l1 == null) {
      return addTwoNumbers(new ListNode(0), l2);
    } else if (l2 == null) {
      return addTwoNumbers(l1, new ListNode(0));
    } else {
      int sum = l1.val + l2.val;
      if (sum > 9) {
        sum -= 10;
        if (l1.next != null) {
          l1.next.val = l1.next.val + 1;
        } else if (l2.next != null) {
          l2.next.val = l2.next.val + 1;
        } else {
          l1.next = new ListNode(1);
        }
      }
      ListNode result = new ListNode(sum);
      result.next = addTwoNumbers(l1.next, l2.next);
      return result;
    }
  }

}
