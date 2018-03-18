package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class ReverseLinkedListInPairsRecursiveTest {

    @Test
    public void testReverse() {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 5);
        System.out.println(new ReverseLinkedListInPairsRecursive().reverse(head));
    }

    @Test
    public void testReverse1() {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 6);
        System.out.println(new ReverseLinkedListInPairsRecursive().reverse(head));
    }

}