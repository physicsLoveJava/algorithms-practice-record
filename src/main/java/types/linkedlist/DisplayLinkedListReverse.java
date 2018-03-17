package types.linkedlist;

import util.adt.LinkNode;

public class DisplayLinkedListReverse {

    public void displayReverse(LinkNode head) {
        if(head == null) {
            return;
        }
        displayReverse(head.getNext());
        System.out.printf(head.getData() + " ");
    }

}
