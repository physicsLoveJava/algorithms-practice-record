package offer;

import util.adt.LinkNode;

public class ReverseLinkedList {

    public static LinkNode<Integer> reverse(LinkNode<Integer> list) {
        if(list == null) {
            return null;
        }
        LinkNode<Integer> p = list;
        LinkNode<Integer> result = p.getNext();
        while(p != null) {
            if(result == null) {
                return p;
            }
            LinkNode<Integer> temp = result.getNext();
            result.setNext(p);
            if(p.getNext() == result) {
                p.setNext(null);
            }
            p = result;
            result = temp;
        }
        return result;
    }

}
