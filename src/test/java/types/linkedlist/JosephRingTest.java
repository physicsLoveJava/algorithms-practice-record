package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class JosephRingTest {

    @Test
    public void find() {

        LinkNode<Integer> head = CreationUtils.circularLinkedList(0, 5);
        System.out.println(new JosephRing().find(head, 3));

    }

    @Test
    public void find2() {

        LinkNode<Integer> head = CreationUtils.circularLinkedList(0, 2);
        System.out.println(new JosephRing().find(head, 2));

    }

}