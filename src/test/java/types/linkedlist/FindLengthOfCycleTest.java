package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class FindLengthOfCycleTest {
    @Test
    public void find() throws Exception {

        LinkNode<Integer> head = CreationUtils.linkedList(1, 4);
        LinkNode<Integer> last = head.getNext().getNext();
        last.setNext(new LinkNode<>(4, new LinkNode<>(5, new LinkNode<>(6, last))));

        assertEquals(3, new FindLengthOfCycle().find(head));
    }

    @Test
    public void find2() throws Exception {

        LinkNode<Integer> head = CreationUtils.linkedList(1, 4);
        LinkNode<Integer> last = head.getNext().getNext();
        last.setNext(new LinkNode<>(4, new LinkNode<>(5, last)));

        assertEquals(2, new FindLengthOfCycle().find(head));
    }

}