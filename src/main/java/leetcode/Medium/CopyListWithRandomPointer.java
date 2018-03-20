package leetcode.Medium;

import util.adt.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/copy-list-with-random-pointer
 */
public class CopyListWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode p = head;
        while(p != null) {
            map.put(p, new RandomListNode(p.label));
            p = p.next;
        }
        p = head;
        while(p != null) {
            RandomListNode copy = map.get(p);
            copy.next = map.get(p.next);
            copy.random = map.get(p.random);
            p = p.next;
        }
        return map.get(head);
    }

}
