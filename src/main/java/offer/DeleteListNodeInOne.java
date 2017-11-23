package offer;

import util.adt.LinkNode;

public class DeleteListNodeInOne {

    public static int delete(LinkNode<Integer> head, LinkNode<Integer> node) {
        if(head == null || node == null) {
            return -1;
        }
        LinkNode<Integer> nextNode = node.getNext();
        if(nextNode == null) {
            Integer data = node.getData();
            LinkNode<Integer> p = head;
            while(p != null && p.getNext() != null) {
                LinkNode<Integer> cache = p;
                p = p.getNext();
                if(p.getNext() == null) {
                    cache.setNext(null);
                }
            }
            return data;
        }else {
            Integer data = node.getData();
            node.setData(nextNode.getData());
            node.setNext(nextNode.getNext());
            return data;
        }
    }

}
