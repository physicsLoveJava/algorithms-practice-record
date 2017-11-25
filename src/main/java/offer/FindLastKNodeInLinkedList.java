package offer;

import util.adt.LinkNode;

public class FindLastKNodeInLinkedList {

    public static Integer find(LinkNode<Integer> list, int k) {
        if(list == null || k < 1) {
            return null;
        }
        LinkNode<Integer> p1 = list;
        LinkNode<Integer> p2 = list;
        for (int i = 0; i < k; i++) {
            if(p1 != null) {
                p1 = p1.getNext();
            }else {
                return null;
            }
        }
        while(p1 != null) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p2.getData();
    }

}
