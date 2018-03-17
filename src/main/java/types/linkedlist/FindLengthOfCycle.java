package types.linkedlist;

import util.adt.LinkNode;

public class FindLengthOfCycle {

    public int find(LinkNode head) {
        LinkNode p1 = head;
        LinkNode p2 = head;
        boolean hasCycle = false;
        int count = 0;
        while(p1 != null && p2 != null && p2.getNext() != null) {
            p1 = p1.getNext();
            p2 = p2.getNext().getNext();
            if(p1 == p2) {
                hasCycle = true;
                break;
            }
        }
        if(hasCycle) {
            p1 = p1.getNext();
            while(p1 != p2) {
                p1 = p1.getNext();
                count++;
            }
            return count;
        }
        return 0;
    }

}
