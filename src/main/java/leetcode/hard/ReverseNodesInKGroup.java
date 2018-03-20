package leetcode.hard;

import util.adt.ListNode;

/**
 *  https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 */
public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k < 1) {
            return head;
        }
        int len = findLength(head);
        if(len < k) {
            return head;
        }
        ListNode part = split(head, k);
        ListNode reverse = reverse(head);
        head.next = reverseKGroup(part, k);
        return reverse;
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

    private ListNode reverse(ListNode head) {
        ListNode p = head;
        ListNode res = null;
        while(p != null) {
            ListNode tmp = p.next;
            if(res == null) {
                res = p;
            }else {
                p.next = res;
                res = p;
            }
            p = tmp;
        }
        return res;
    }

    private ListNode split(ListNode head, int k) {
        ListNode p = head;
        for (int i = 1; i < k && p != null; i++) {
            p = p.next;
        }
        if(p == null) {
            return null;
        }
        ListNode next = p.next;
        p.next = null;
        return next;
    }

}
