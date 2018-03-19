package types.linkedlist;

import util.adt.LinkNode;

public class FindIfLinkedListIsPalindrome {

    public boolean isParlindrome(LinkNode head) {
        if(head == null) {
            return false;
        }
        return isParlindrome(head, head) != null;
    }

    private LinkNode isParlindrome(LinkNode node, LinkNode head) {
        if(node == null) {
            return head;
        }
        LinkNode rs = isParlindrome(node.getNext(), head);
        if(rs != null && rs.getData() == node.getData()) {
            return rs.getNext() == null ? rs : rs.getNext();
        }
        return null;
    }

}
