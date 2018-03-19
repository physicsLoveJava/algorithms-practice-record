package types.linkedlist;

import util.adt.LinkNode;

public class SplitLinkedListToOddAndEven {

    public LinkNode split(LinkNode<Integer> head) {
        if(head == null) {
            return null;
        }
        LinkNode rs = new LinkNode(1, null), cur = rs, curPrev = rs;
        LinkNode<Integer> p = head, prev = head;
        boolean hasAtleastOne = false;
        while(p != null) {
            if((p.getData() % 2) != 0) {
                hasAtleastOne = true;
                cur.setData(p.getData());
                cur.setNext(new LinkNode(1, null));
                curPrev = cur;
                cur = cur.getNext();
                prev.setNext(p.getNext());
            }else {
                prev = p;
            }
            p = p.getNext();
        }
        if(!hasAtleastOne) {
            rs = null;
        }else {
            curPrev.setNext(null);
        }
        prev.setNext(rs);
        return head;
    }

}
