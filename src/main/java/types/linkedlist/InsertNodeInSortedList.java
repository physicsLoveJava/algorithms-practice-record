package types.linkedlist;

import util.adt.LinkNode;

public class InsertNodeInSortedList {

    public LinkNode<Integer> insert(LinkNode<Integer> head, int val) {
        if(head == null) {
            return new LinkNode<>(val, null);
        }
        if(head.getData() > val) {
            return new LinkNode<>(val, head);
        }
        LinkNode<Integer> p = head, prev = head;
        boolean isInsert = false;
        while(p != null) {
            if(val < p.getData()) {
                prev.setNext(new LinkNode<>(val, p));
                isInsert = true;
                break;
            }else {
                prev = p;
                p = p.getNext();
            }
        }
        if(!isInsert) {
            prev.setNext(new LinkNode<>(val, null));
        }
        return head;
    }

}
