package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/reverse-linked-list-ii
 */
public class ReverseLinkedListIi {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode h1 = new ListNode(0);
        h1.next = head;
        int count = 0;
        ListNode p = h1;
        ListNode leftNode = null, rightNode = null;
        while(p != null) {
            if(count == m - 1) {
                leftNode = p;
            }
            if(count == n) {
                rightNode = p;
                ListNode last = rightNode.next;
                rightNode.next = null;
                rightNode = last;
            }
            p = p.next;
            count++;
        }
        ListNode temp = leftNode.next;
        ListNode reverse = reverse(leftNode.next);
        leftNode.next = reverse;
        temp.next = rightNode;
        return h1.next;
    }

    private ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode res = reverse(head.next);
        if(res == null) {
            return head;
        }
        head.next.next = head;
        head.next = null;
        return res;
    }

}
