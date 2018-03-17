package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class ReverseLinkedListSp1Test {
    @Test
    public void reverse() throws Exception {

        LinkNode<Integer> node = CreationUtils.linkedList(0, 5);
        System.out.println(new ReverseLinkedListSp1().reverse(node));

    }

}