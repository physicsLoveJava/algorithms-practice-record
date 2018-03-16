package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/remove-linked-list-elements
 */
public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        while(head != null && head.val == val) {
            head = head.next;
        }
        if(head == null) {
            return null;
        }
        ListNode p = head;
        ListNode t = head;
        while(p != null) {
            if(p.val == val) {
                t.next = p.next;
                p = t.next;
            }else {
                t = p;
                p = p.next;
            }
        }
        return head;
    }

}
