package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class MergeTwoSortedListIterativeTest {
    @Test
    public void merge() throws Exception {

        LinkNode<Integer> n1 = CreationUtils.linkedList(0, 4);
        LinkNode<Integer> n2 = CreationUtils.linkedList(2, 7);

        System.out.println(new MergeTwoSortedListIterative().merge(n1, n2));
    }

}