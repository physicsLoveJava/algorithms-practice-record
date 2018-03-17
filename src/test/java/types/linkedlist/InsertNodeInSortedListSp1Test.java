package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class InsertNodeInSortedListSp1Test {

    @Test
    public void insert() throws Exception {

        LinkNode<Integer> node = CreationUtils.linkedList(0, 5);

        System.out.println(new InsertNodeInSortedListSp1().insert(node, -1));
        System.out.println(new InsertNodeInSortedListSp1().insert(node, 0));
        System.out.println(new InsertNodeInSortedListSp1().insert(node, 2));
        System.out.println(new InsertNodeInSortedListSp1().insert(node, 5));

    }

}