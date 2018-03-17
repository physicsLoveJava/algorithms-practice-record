package types.linkedlist;

import util.adt.LinkNode;

public class FindBeginingOfCycle {

    public LinkNode find(LinkNode head) {
        LinkNode p1 = head;
        LinkNode p2 = head;
        boolean hasCycle = false;
        while(p1 != null && p2 != null && p2.getNext() != null) {
            p1 = p1.getNext();
            p2 = p2.getNext().getNext();
            if(p1 == p2) {
                hasCycle = true;
                break;
            }
        }
        System.out.println(p2.getData());
        if(hasCycle) {
            p1 = head;
            while(p1 != p2) {
                p1 = p1.getNext();
                p2 = p2.getNext();
            }
            return p1;
        }
        return null;
    }

}
