package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/rotate-list
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        int len = findLength(head);
        if(len == 0) {
            return head;
        }
        int count = len - (k % len);
        ListNode p = head;
        for (int i = 1; i < count; i++) {
            p = p.next;
        }
        if(p == null || p.next == null) {
            return head;
        }
        ListNode tmp = p.next;
        p.next = null;
        ListNode last = findLast(tmp);
        last.next = head;
        return tmp;
    }

    private ListNode findLast(ListNode tmp) {
        ListNode p = tmp;
        while(p != null && p.next != null) {
            p = p.next;
        }
        return p;
    }

    private int findLength(ListNode head) {
        int count = 0;
        ListNode p = head;
        while(p != null) {
            p = p.next;
            count++;
        }
        return count;
    }

}
