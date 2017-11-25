package offer;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class FindLastKNodeInLinkedListTest {

    @Test
    public void find() throws Exception {
        LinkNode<Integer> root = CreationUtils.linkedList(1, 10);
        assertEquals(null, FindLastKNodeInLinkedList.find(null, 0));
        assertEquals(null, FindLastKNodeInLinkedList.find(null, -1));
        assertEquals(9, FindLastKNodeInLinkedList.find(root, 1).intValue());
        assertEquals(8, FindLastKNodeInLinkedList.find(root, 2).intValue());
        assertEquals(1, FindLastKNodeInLinkedList.find(root, 9).intValue());
        assertEquals(null, FindLastKNodeInLinkedList.find(root, 10));
    }

}