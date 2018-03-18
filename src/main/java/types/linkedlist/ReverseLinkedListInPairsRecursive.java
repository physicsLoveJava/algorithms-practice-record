package types.linkedlist;

import util.adt.LinkNode;

public class ReverseLinkedListInPairsRecursive {

    public LinkNode reverse(LinkNode head) {
        if(head == null || head.getNext() == null) {
            return head;
        }
        LinkNode tmp = head.getNext();
        head.setNext(head.getNext().getNext());
        tmp.setNext(head);
        head = tmp;
        head.getNext().setNext(reverse(head.getNext().getNext()));
        return head;
    }

}
