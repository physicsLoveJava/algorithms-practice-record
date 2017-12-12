package offer;

import org.junit.Test;
import util.CreationUtils;

import static org.junit.Assert.*;
import static util.CreationUtils.linkedList;

public class FindTwoLinkedListCommonNodeTest {
    @Test
    public void find() throws Exception {

        assertEquals(Integer.valueOf(5), FindTwoLinkedListCommonNode.find(linkedList(1, 10), linkedList(5, 10)));

    }

    @Test
    public void find2() throws Exception {

        assertEquals(Integer.valueOf(5), FindTwoLinkedListCommonNode.find2(linkedList(1, 10), linkedList(5, 10)));

    }

}