package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/reverse-linked-list
 */
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode next = p.next;
        ListNode prev;
        p.next = null;
        while(next != null) {
            prev = next.next;
            next.next = p;
            p = next;
            next = prev;
        }
        return p;
    }

}
