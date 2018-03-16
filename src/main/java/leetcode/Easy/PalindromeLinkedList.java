package leetcode.Easy;

import util.adt.LinkNode;

/**
 * Problem Url: https://leetcode.com/problems/palindrome-linked-list
 */
public class PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public boolean isPalindrome(ListNode head) {
        return head == null || recurse (head, head) != null;
    }

    private ListNode recurse (ListNode node, ListNode head) {
        if (node == null) return  head;
        ListNode res = recurse (node.next, head);
        if (res == null) return res;
        else if (res.val == node.val) return (res.next == null ? res : res.next);
        else return null;
    }

}
