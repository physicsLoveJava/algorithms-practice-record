package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/remove-duplicates-from-sorted-list
 */
public class RemoveDuplicatesFromSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        Integer temp = null;
        ListNode p = head;
        ListNode prev = null;
        while(p != null) {
            if(temp == null) {
                temp = p.val;
                prev = p;
            }else {
                if(temp == p.val) {
                    if(p.next == null) {
                        p = null;
                        prev.next = null;
                    }else {
                        prev.next = p.next;
                        p = prev.next;
                    }
                    continue;
                }else {
                    temp = p.val;
                    prev = p;
                }
            }
            p = p.next;
        }
        return head;
    }

}
