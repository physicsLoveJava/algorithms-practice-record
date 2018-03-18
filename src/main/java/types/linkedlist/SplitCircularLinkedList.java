package types.linkedlist;

import util.adt.LinkNode;

public class SplitCircularLinkedList {

    public LinkNode[] split(LinkNode head) {
        if(head == null) {
            return null;
        }
        LinkNode fast = head, slow = head;
        LinkNode h1, h2 = null;
        while(fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        if(fast.getNext().getNext() == head) {
            fast = fast.getNext();
        }
        h1 = slow;
        if(head.getNext() != head) {
            h2 = fast;
        }
        fast.setNext(slow.getNext());
        slow.setNext(head);
        return new LinkNode[] {
                h1, h2
        };
    }

}
