package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/odd-even-linked-list
 */
public class OddEvenLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
