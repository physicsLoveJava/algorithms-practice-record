package types.linkedlist;

import util.adt.LinkNode;

public class ReverseLinkedListInPairs {

    public LinkNode reverse(LinkNode head) {
        if(head == null || head.getNext() == null) {
            return head;
        }

        LinkNode p = head;
        while(p != null && p.getNext() != null) {
            swap(p, p.getNext());
            p = p.getNext().getNext();
        }
        return head;
    }

    private void swap(LinkNode a, LinkNode b) {
        Comparable tmp = a.getData();
        a.setData(b.getData());
        b.setData(tmp);
    }

}
