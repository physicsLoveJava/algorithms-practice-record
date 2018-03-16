package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.PrintUtils;

import static org.junit.Assert.*;

public class FindNthNodeInListTest {
    @Test
    public void find() throws Exception {

        assertEquals(null, new FindNthNodeInList().find(
                CreationUtils.linkedList(0, 10), 11
        ));

        assertEquals(null, new FindNthNodeInList().find(
                CreationUtils.linkedList(0, 10), 11
        ));

        assertEquals(Integer.valueOf(0), new FindNthNodeInList().find(
                CreationUtils.linkedList(0, 10), 10
        ).getData());

        assertEquals(Integer.valueOf(1), new FindNthNodeInList().find(
                CreationUtils.linkedList(0, 10), 9
        ).getData());

    }

}