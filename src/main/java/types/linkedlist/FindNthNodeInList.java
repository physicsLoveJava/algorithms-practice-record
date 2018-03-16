package types.linkedlist;

import util.adt.LinkNode;

public class FindNthNodeInList {

    public LinkNode<Integer> find(LinkNode<Integer> list, int n) {
        int len = 0;
        LinkNode<Integer> p = list;
        while(p != null) {
            p = p.getNext();
            len ++;
        }
        if(len < n) {
            return null;
        }

        p = list;
        while(p != null && len - n > 0) {
            p = p.getNext();
            len --;
        }
        return p;
    }

}
