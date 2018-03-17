package types.linkedlist;

import util.adt.LinkNode;

public class ReverseLinkedListSp1 {

    public LinkNode reverse(LinkNode head) {
        if(head == null) {
            return null;
        }
        LinkNode reverse = reverse(head.getNext());
        if(reverse == null) {
            return head;
        }
        head.getNext().setNext(head);
        head.setNext(null);
        return reverse;
    }

}
