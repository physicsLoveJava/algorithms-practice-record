package leetcode.Medium;

import org.junit.Test;
import util.CreationUtils;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void removeNthFromEnd() throws Exception {

        System.out.println(new RemoveNthNodeFromEndOfList().removeNthFromEnd(
                CreationUtils.linkedListForListNode(0, 10), 10
        ));

    }

}