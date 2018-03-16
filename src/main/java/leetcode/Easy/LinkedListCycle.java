package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/linked-list-cycle
 */
public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        do {
            p1 = p1.next;
            p2 = p2.next.next;
        } while (p1 != null && p2 != null && p2.next != null && p1 != p2);
        return p1 != null && p2 != null && p1 == p2;
    }

}
