package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;

import static org.junit.Assert.*;

public class FindNthNodeInListSp1Test {
    @Test
    public void find() throws Exception {

        assertEquals(null, new FindNthNodeInListSp1().find(
                CreationUtils.linkedList(0, 10), 11
        ));

        assertEquals(null, new FindNthNodeInListSp1().find(
                CreationUtils.linkedList(0, 10), 11
        ));

        assertEquals(Integer.valueOf(0), new FindNthNodeInListSp1().find(
                CreationUtils.linkedList(0, 10), 10
        ).getData());

        assertEquals(Integer.valueOf(1), new FindNthNodeInListSp1().find(
                CreationUtils.linkedList(0, 10), 9
        ).getData());

    }

}