package offer;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class MergeLinkedListTest {
    @Test
    public void merge() throws Exception {
        LinkNode<Integer> listA = CreationUtils.linkedList(1, 3);
        LinkNode<Integer> listB = CreationUtils.linkedList(2, 4);
        LinkNode<Integer> listC = MergeLinkedList.merge(listA, listB);
        System.out.println(listC);
    }

}