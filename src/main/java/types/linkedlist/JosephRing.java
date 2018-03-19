package types.linkedlist;

import util.adt.LinkNode;

public class JosephRing {

    public LinkNode find(LinkNode head, int m) {
        if(head == null) {
            return null;
        }
        if(head.getNext() == head) {
            return new LinkNode(head.getData(), null);
        }
        int count = m;
        LinkNode p = head, prev = head;
        while(p != null && --count > 0) {
            prev = p;
            p = p.getNext();
        }
        prev.setNext(prev.getNext().getNext());
        return find(prev, m);
    }

}
