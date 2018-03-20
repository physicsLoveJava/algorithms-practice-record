package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/sort-list
 */
public class SortListSp1 {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return mergeList(left, right);
    }

    private ListNode mergeList(ListNode left, ListNode right) {
        ListNode result = new ListNode(0), rs = result;
        while(left != null && right != null) {
            if(left.val < right.val) {
                rs.next = left;
                left = left.next;
            }else {
                rs.next = right;
                right = right.next;
            }
            rs = rs.next;
        }
        if(left != null) {
            rs.next = left;
        }
        if(right != null) {
            rs.next = right;
        }
        return result.next;
    }

}
