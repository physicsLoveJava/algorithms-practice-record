package types.linkedlist;

import util.adt.LinkNode;

public class InsertNodeInSortedListSp1 {

    public LinkNode<Integer> insert(LinkNode<Integer> head, int val) {
        if(head == null) {
            return new LinkNode<>(val, null);
        }
        LinkNode<Integer> p = head, temp = head;
        while(p != null && p.getData() < val) {
            temp = p;
            p = p.getNext();
        }
        if(temp != head) {
            temp.setNext(new LinkNode<>(val, p));
        }else {
            return new LinkNode<>(val, head);
        }
        return head;
    }

}
