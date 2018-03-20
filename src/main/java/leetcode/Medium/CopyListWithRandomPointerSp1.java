package leetcode.Medium;

import util.adt.RandomListNode;

/**
 * Problem Url: https://leetcode.com/problems/copy-list-with-random-pointer
 */
public class CopyListWithRandomPointerSp1 {

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode p = head;
        while(p != null) {
            RandomListNode tmp = p.next;
            p.next = new RandomListNode(p.label);
            p.next.next = tmp;
            p = tmp;
        }
        p = head;
        while(p != null) {
            if(p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        RandomListNode result = new RandomListNode(0), rs = result;
        p = head;
        while(p != null) {
            RandomListNode tmp = p.next.next;
            rs.next = p.next;
            rs = rs.next;
            p.next = tmp;
            p = tmp;
        }
        return result.next;
    }

}
