package types.linkedlist;

import util.adt.LinkNode;

public class MergeTwoSortedList {

    public LinkNode merge(LinkNode n1, LinkNode n2) {
        if(n1 == null) {
            return n2;
        }
        if(n2 == null) {
            return n1;
        }
        if(n1.getData().compareTo(n2.getData()) < 0) {
            return new LinkNode<>(n1.getData(), merge(n1.getNext(), n2));
        }else {
            return new LinkNode<>(n2.getData(), merge(n1, n2.getNext()));
        }
    }

}
