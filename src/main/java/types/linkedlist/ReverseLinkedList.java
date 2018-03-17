package types.linkedlist;

import util.adt.LinkNode;

public class ReverseLinkedList {

    public LinkNode reverse(LinkNode head) {
        LinkNode p = head, next = null, temp = null;
        while(p != null) {
            next = p.getNext();
            p.setNext(temp);
            temp = p;
            p = next;
        }
        return temp;
    }

}
