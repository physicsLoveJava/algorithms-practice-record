package offer;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    @Test
    public void reverse() throws Exception {
        LinkNode<Integer> root = CreationUtils.linkedList(1, 10);
        LinkNode<Integer> reverse = CreationUtils.linkedList(1, 10, -1);
        assertEquals(null, ReverseLinkedList.reverse(null));
        assertEquals(reverse, ReverseLinkedList.reverse(root));
    }

}