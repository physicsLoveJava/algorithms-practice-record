package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/sort-list
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode pivot = head;
        ListNode dLeft = new ListNode(0), left = dLeft;
        ListNode dRight = new ListNode(0), right = dRight;
        ListNode t = head.next;
        while(t != null) {
            if(t.val < pivot.val) {
                left.next = t;
                left = left.next;
            }else {
                right.next = t;
                right = right.next;
            }
            ListNode tmp = t.next;
            t.next = null;
            t = tmp;
        }
        pivot.next = null;
        ListNode leftPart = sortList(dLeft.next);
        pivot.next = sortList(dRight.next);
        if(leftPart == null) {
            return pivot;
        }else {
            ListNode leftLast = findLast(leftPart);
            leftLast.next = pivot;
            return leftPart;
        }
    }

    private ListNode findLast(ListNode leftPart) {
        ListNode last = leftPart;
        while(last != null && last.next != null) {
            last = last.next;
        }
        return last;
    }

}
