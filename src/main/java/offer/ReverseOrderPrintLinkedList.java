package offer;

import util.adt.LinkNode;

public class ReverseOrderPrintLinkedList {

    public static void reverse(LinkNode node) {
        if(node == null) {
            return;
        }
        LinkNode p = node;
        reverse(p.getNext());
        print(p);
    }

    private static void print(LinkNode p) {
        System.out.println(p.getData());
    }

}
