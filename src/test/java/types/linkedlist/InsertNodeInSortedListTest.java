package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class InsertNodeInSortedListTest {
    @Test
    public void insert() throws Exception {

        LinkNode<Integer> node = CreationUtils.linkedList(0, 5);

        System.out.println(new InsertNodeInSortedList().insert(node, -1));
        System.out.println(new InsertNodeInSortedList().insert(node, 0));
        System.out.println(new InsertNodeInSortedList().insert(node, 2));
        System.out.println(new InsertNodeInSortedList().insert(node, 5));

    }

}