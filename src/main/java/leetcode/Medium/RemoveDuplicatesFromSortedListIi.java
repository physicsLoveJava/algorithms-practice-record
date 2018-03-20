package leetcode.Medium;

import util.adt.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
 */
public class RemoveDuplicatesFromSortedListIi {

    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode p = head;
        while(p != null) {
            if(!map.containsKey(p.val)) {
                map.put(p.val, 0);
            }
            map.put(p.val, map.get(p.val) + 1);
            p = p.next;
        }
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode t = dummy;
        do {
            if (t.next == null) {
                break;
            }
            Integer val = map.get(t.next.val);
            if(val != null && val > 1) {
                t.next = t.next.next;
            }else {
                t = t.next;
            }
        }while (t != null);
        return dummy.next;
    }

}
