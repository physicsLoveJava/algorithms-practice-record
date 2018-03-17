package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class FindMiddleNodeInLinkedListTest {
    @Test
    public void findMiddle() throws Exception {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 10);
        System.out.println(new FindMiddleNodeInLinkedList().findMiddle(head));
    }

    @Test
    public void findMiddle2() throws Exception {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 9);
        System.out.println(new FindMiddleNodeInLinkedList().findMiddle(head));
    }

}