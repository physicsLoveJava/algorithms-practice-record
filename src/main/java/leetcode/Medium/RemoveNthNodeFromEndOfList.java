package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/remove-nth-node-from-end-of-list
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 1) {
            return null;
        }
        int len = findLength(head);
        if(n > len) {
            return null;
        }
        if(n == len) {
            return head.next;
        }
        ListNode p = head;
        for (int i = n + 1; i < len; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    private int findLength(ListNode head) {
        int count = 0;
        ListNode p = head;
        while(p != null) {
            p = p.next;
            count ++;
        }
        return count;
    }

}
