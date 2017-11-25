package offer;

import util.adt.LinkNode;

public class MergeLinkedList {

    public static LinkNode<Integer> merge(LinkNode<Integer> listA, LinkNode<Integer> listB) {
        if(listA == null) {
            return listB;
        }
        if(listB == null) {
            return listA;
        }
        LinkNode<Integer> p1 = listA;
        LinkNode<Integer> p2 = listB;
        LinkNode<Integer> result = null;
        while(p1 != null && p2 != null) {
            if(p1.getData() >= p2.getData()) {
                if(result == null) {
                    result = p2;
                }
                LinkNode<Integer> pN = p2.getNext();
                p1.setNext(new LinkNode<>(p1.getData(), p1.getNext()));
                p1.setData(p2.getData());
                p1 = p1.getNext();
                p2 = pN;
            }else {
                LinkNode<Integer> temp = p1;
                p1 = p2;
                p2 = temp;
            }
        }
        return result;
    }

}
