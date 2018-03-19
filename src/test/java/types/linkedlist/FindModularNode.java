package types.linkedlist;

import util.adt.LinkNode;

public class FindModularNode {

    public LinkNode find(LinkNode head, int m) {
        LinkNode modNode = null;
        LinkNode p = head;
        int i = 0;
        while(p != null) {
            if((i % m) == 0) {
                modNode = p;
            }
            p = p.getNext();
            i++;
        }
        return modNode;
    }

}
