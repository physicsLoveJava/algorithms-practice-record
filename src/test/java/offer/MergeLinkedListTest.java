package offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static util.CreationUtils.linkedList;

public class MergeLinkedListTest {
    @Test
    public void merge() throws Exception {
        assertEquals(linkedList(1, 7), MergeLinkedList.merge(linkedList(1, 5), linkedList(5, 7)));
    }

    @Test
    public void merge2() throws Exception{
        System.out.println(MergeLinkedList.merge(linkedList(1, 5), linkedList(3, 7)));
        assertEquals("LinkNode{val=1, " +
                        "next=LinkNode{val=2, " +
                        "next=LinkNode{val=3, " +
                        "next=LinkNode{val=3, " +
                        "next=LinkNode{val=4, " +
                        "next=LinkNode{val=4, " +
                        "next=LinkNode{val=5, " +
                        "next=LinkNode{val=6, " +
                        "next=null}}}}}}}}",
                MergeLinkedList.merge(linkedList(1, 5), linkedList(3, 7)).toString());
    }

}