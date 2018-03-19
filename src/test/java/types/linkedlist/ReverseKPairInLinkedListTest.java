package types.linkedlist;

import org.junit.Before;
import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class ReverseKPairInLinkedListTest {

    private LinkNode head = CreationUtils.linkedList(0, 10);

    @Before
    public void setup() {
        head = CreationUtils.linkedList(0, 10);
    }

    @Test
    public void reverse() throws Exception {
        System.out.println(new ReverseKPairInLinkedList().reverse(head, 1));
    }

    @Test
    public void reverse2() throws Exception {
        System.out.println(new ReverseKPairInLinkedList().reverse(head, 2));
    }

    @Test
    public void reverse3() throws Exception {
        System.out.println(new ReverseKPairInLinkedList().reverse(head, 3));
    }

    @Test
    public void reverse4() throws Exception {
        System.out.println(new ReverseKPairInLinkedList().reverse(head, 11));
    }

    @Test
    public void reverseLinkedList() throws Exception {
        System.out.println(new ReverseKPairInLinkedList().reverseLinkedList(head, 3));
    }





}