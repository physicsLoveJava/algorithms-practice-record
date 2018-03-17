package types.linkedlist;

import util.adt.LinkNode;

public class FindIntersectionNode {


    public LinkNode find(LinkNode n1, LinkNode n2) {
        if(n1 == null || n2 == null) {
            return null;
        }
        int len1 = findLength(n1);
        int len2 = findLength(n2);
        int gap = len1 - len2;
        if(gap < 0) {
            LinkNode tmp = n1;
            n1 = n2;
            tmp = n2;
            gap *= -1;
        }
        LinkNode p1 = n1;
        LinkNode p2 = n2;
        while(gap > 0) {
            p1 = p1.getNext();
        }
        while(p1 != null && p2 != null && p1 != p2) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p1;
    }

    private int findLength(LinkNode n1) {
        int count = 0;
        LinkNode p = n1;
        while(p != null) {
            p = p.getNext();
            count++;
        }
        return count;
    }


}
