package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class FindIfLinkedListIsPalindromeTest {
    @Test
    public void isParlindrome() throws Exception {

        LinkNode<Integer> head = CreationUtils.linkedList(0, 5);
        System.out.println(new FindIfLinkedListIsPalindrome().isParlindrome(head));

    }

}