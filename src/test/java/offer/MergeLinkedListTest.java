package offer;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;
import static util.CreationUtils.linkedList;

public class MergeLinkedListTest {
    @Test
    public void merge() throws Exception {
        assertEquals(linkedList(1, 7), MergeLinkedList.merge(linkedList(1, 5), linkedList(5, 7)));
    }

    @Test
    public void merge2() throws Exception{
        System.out.println(MergeLinkedList.merge(linkedList(1, 5), linkedList(3, 7)));
        assertEquals("LinkNode{data=1, " +
                        "next=LinkNode{data=2, " +
                        "next=LinkNode{data=3, " +
                        "next=LinkNode{data=3, " +
                        "next=LinkNode{data=4, " +
                        "next=LinkNode{data=4, " +
                        "next=LinkNode{data=5, " +
                        "next=LinkNode{data=6, " +
                        "next=null}}}}}}}}",
                MergeLinkedList.merge(linkedList(1, 5), linkedList(3, 7)).toString());
    }

}