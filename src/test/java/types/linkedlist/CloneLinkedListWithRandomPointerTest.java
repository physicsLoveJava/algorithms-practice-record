package types.linkedlist;

import org.junit.Test;
import util.adt.LinkNodeRandom;

import static org.junit.Assert.*;

public class CloneLinkedListWithRandomPointerTest {
    @Test
    public void cloneList() throws Exception {

        LinkNodeRandom<Integer> head = new LinkNodeRandom<>(1);
        LinkNodeRandom<Integer> n2 = new LinkNodeRandom<>(2);
        LinkNodeRandom<Integer> n3 = new LinkNodeRandom<>(3);
        head.setNext(n2);
        n2.setNext(n3);
        head.setRandom(n3);
        n2.setRandom(n3);
        System.out.println(head);
        LinkNodeRandom cloneList = new CloneLinkedListWithRandomPointer().cloneList(head);
        System.out.println(cloneList);

        assertFalse(head == cloneList);
    }

}