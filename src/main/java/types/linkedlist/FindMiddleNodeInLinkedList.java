package types.linkedlist;

import util.adt.LinkNode;

public class FindMiddleNodeInLinkedList {

    public LinkNode findMiddle(LinkNode head) {
        if(head == null) {
            return null;
        }
        LinkNode p1 = head, p2 = head;
        while(p1 != null && p2 != null && p2.getNext() != null) {
            p1 = p1.getNext();
            p2 = p2.getNext().getNext();
        }
        return p1;
    }

}
