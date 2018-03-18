package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class ReverseLinkedListInPairsTest {

    @Test
    public void testReverse() {

        LinkNode<Integer> head = CreationUtils.linkedList(0, 8);
        System.out.println(new ReverseLinkedListInPairs().reverse(head));

    }

    @Test
    public void testReverse1() {

        LinkNode<Integer> head = CreationUtils.linkedList(0, 7);
        System.out.println(new ReverseLinkedListInPairs().reverse(head));

    }

}