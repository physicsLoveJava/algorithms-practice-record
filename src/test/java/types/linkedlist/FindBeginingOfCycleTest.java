package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class FindBeginingOfCycleTest {
    @Test
    public void find() throws Exception {

        LinkNode<Integer> head = CreationUtils.linkedList(1, 4);
        LinkNode<Integer> last = head.getNext().getNext();
        last.setNext(new LinkNode<>(4, new LinkNode<>(5, new LinkNode<>(6, last))));

        LinkNode cycleStart = new FindBeginingOfCycle().find(head);
        System.out.println(cycleStart.getData());

    }

}