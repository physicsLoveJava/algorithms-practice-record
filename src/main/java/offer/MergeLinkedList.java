package offer;

import util.adt.LinkNode;

//TODO non-recursive solution for the mergeLinkedList
public class MergeLinkedList {

    public static LinkNode<Integer> merge(LinkNode<Integer> listA, LinkNode<Integer> listB) {
        if(listA == null) {
            return listB;
        }
        if(listB == null) {
            return listA;
        }
        if(listA.getData() > listB.getData()) {
            return merge(listB, listA);
        }else {
            listA.setNext(merge(listA.getNext(), listB));
            return listA;
        }
    }

}
