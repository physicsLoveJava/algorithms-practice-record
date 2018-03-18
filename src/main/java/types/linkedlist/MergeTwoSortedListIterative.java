package types.linkedlist;

import util.adt.LinkNode;

public class MergeTwoSortedListIterative {

    public LinkNode merge(LinkNode n1, LinkNode n2) {
        LinkNode rs = new LinkNode(-1, null);
        LinkNode cur = rs;
        while(n1 != null && n2 != null) {
            if(n1.getData().compareTo(n2.getData()) < 0) {
                cur.setNext(new LinkNode(n1.getData(), null));
                n1 = n1.getNext();
            }else {
                cur.setNext(new LinkNode(n2.getData(), null));
                n2 = n2.getNext();
            }
            cur = cur.getNext();
        }

        while(n1 != null) {
            cur.setNext(new LinkNode(n1.getData(), null));
            n1 = n1.getNext();
            cur = cur.getNext();
        }

        while(n2 != null) {
            cur.setNext(new LinkNode(n2.getData(), null));
            n2 = n2.getNext();
            cur = cur.getNext();
        }
        return rs.getNext();
    }

}
