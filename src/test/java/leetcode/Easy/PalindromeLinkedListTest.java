package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {
    @Test
    public void isPalindrome() throws Exception {

        PalindromeLinkedList.ListNode n1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode n2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode n3 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode n4 = new PalindromeLinkedList.ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        assertTrue(new PalindromeLinkedList().isPalindrome(n1));

    }

    @Test
    public void isPalindrome2() throws Exception {

        PalindromeLinkedList.ListNode n1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode n2 = new PalindromeLinkedList.ListNode(0);
        PalindromeLinkedList.ListNode n3 = new PalindromeLinkedList.ListNode(0);
        n1.next = n2;
        n2.next = n3;
        assertFalse(new PalindromeLinkedList().isPalindrome(n1));

    }

    @Test
    public void isPalindrome3() throws Exception {

        PalindromeLinkedList.ListNode n1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode n2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode n3 = new PalindromeLinkedList.ListNode(3);
        PalindromeLinkedList.ListNode n4 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode n5 = new PalindromeLinkedList.ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        assertTrue(new PalindromeLinkedList().isPalindrome(n1));

    }

}