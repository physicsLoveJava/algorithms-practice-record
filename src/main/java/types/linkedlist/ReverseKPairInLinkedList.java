package types.linkedlist;

import util.adt.LinkNode;

public class ReverseKPairInLinkedList {

    public LinkNode reverse(LinkNode head, int k) {
        if(head == null) {
            return null;
        }
        LinkNode p = findNextPair(head, k);
        if(p == null) {
            return reverseLinkedList(head, k);
        }
        LinkNode rH = reverseLinkedList(head, k);
        LinkNode pNext = reverse(p, k);
        head.setNext(pNext);
        return rH;
    }

    public LinkNode reverseLinkedList(LinkNode head, int k) {
        if(head == null) {
            return null;
        }
        if(k < 1) {
            return null;
        }
        if(k == 1) {
            head.setNext(null);
        }
        LinkNode p = reverseLinkedList(head.getNext(), k - 1);
        if(p == null) {
            return head;
        }
        LinkNode last = findLast(p);
        head.setNext(null);
        if(last != null) {
            last.setNext(head);
            return p;
        }
        return p;
    }

    private LinkNode findLast(LinkNode p) {
        LinkNode cur = p;
        while(cur != null && cur.getNext() != null) {
            cur = cur.getNext();
        }
        return cur;
    }

    private LinkNode findNextPair(LinkNode head, int k) {
        LinkNode x = head;
        while(x != null && k > 0) {
            x = x.getNext();
            k--;
        }
        return x;
    }

}
