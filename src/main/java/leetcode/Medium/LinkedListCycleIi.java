
package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/linked-list-cycle-ii
 */
public class LinkedListCycleIi {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        boolean hasCycle = false;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle) {
            return null;
        }
        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
