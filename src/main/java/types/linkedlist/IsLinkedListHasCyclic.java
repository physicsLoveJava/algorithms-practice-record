package types.linkedlist;

import util.adt.LinkNode;

public class IsLinkedListHasCyclic {

    public boolean hasCycle(LinkNode<Integer> head) {
        if(head == null) {
            return false;
        }
        LinkNode p1 = head, p2 = head;
        while(p1 != null && p2 != null && p2.getNext() != null) {
            p1 = p1.getNext();
            p2 = p2.getNext().getNext();
            if(p1 == p2) {
                return true;
            }
        }
        return false;
    }

}
