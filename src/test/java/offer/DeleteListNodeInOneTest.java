package offer;

import org.junit.Test;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class DeleteListNodeInOneTest {

    @Test
    public void delete() throws Exception {

        LinkNode<Integer> node1 = new LinkNode<>(1, null);
        LinkNode<Integer> node2 = new LinkNode<>(2, node1);
        LinkNode<Integer> node3 = new LinkNode<>(3, node2);
        LinkNode<Integer> root = new LinkNode<>(5, node3);

        assertEquals(3, DeleteListNodeInOne.delete(root, node3));
        assertEquals(2, root.getNext().getData().intValue());

    }

    @Test
    public void deleteWhenLast() {
        LinkNode<Integer> node3 = new LinkNode<>(3, null);
        LinkNode<Integer> root = new LinkNode<>(5, node3);

        assertEquals(3, DeleteListNodeInOne.delete(root, node3));
        assertEquals(null, root.getNext());
    }
}