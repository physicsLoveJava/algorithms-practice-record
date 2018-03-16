package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/intersection-of-two-linked-lists
 */
public class IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int len1 = findLength(headA);
        int len2 = findLength(headB);
        int gap = len1 - len2;
        if(gap < 0) {
            ListNode tmp = headA;
            headA = headB;
            headB = tmp;
            gap = -1 * gap;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(gap > 0 && p1 != null) {
            p1 = p1.next;
            gap--;
        }
        while(p1 != null && p2 != null && p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    private int findLength(ListNode headA) {
        int len = 0;
        ListNode p = headA;
        while( p != null) {
            len ++;
            p = p.next;
        }
        return len;
    }

}
