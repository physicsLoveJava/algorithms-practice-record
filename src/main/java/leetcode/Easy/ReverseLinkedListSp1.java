package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/reverse-linked-list
 */
public class ReverseLinkedListSp1 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode next = reverseList(head.next);
        if(head.next != null) {
            head.next.next = head;
        }
        head.next = null;
        if(next == null) {
            return head;
        }
        return next;
    }

}
