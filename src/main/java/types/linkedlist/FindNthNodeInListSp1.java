package types.linkedlist;

import util.adt.LinkNode;

public class FindNthNodeInListSp1 {

    public LinkNode<Integer> find(LinkNode<Integer> list, int n) {
        if(n < 1) {
            return null;
        }
        LinkNode<Integer> rsNode = null, p = list;
        for (int i = 1; i < n; i++) {
            if(p != null) {
                p = p.getNext();
            }
        }
        while(p != null) {
            p = p.getNext();
            if(rsNode == null) {
                rsNode = list;
            }else {
                rsNode = rsNode.getNext();
            }
        }
        return rsNode;
    }

}
