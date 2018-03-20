package leetcode.Medium;

import org.junit.Test;
import util.adt.RandomListNode;

public class CopyListWithRandomPointerSp1Test {
    @Test
    public void copyRandomList() throws Exception {

        RandomListNode n1 = new RandomListNode(-1);
        RandomListNode n2 = new RandomListNode(-1);
        n1.next = n2;
        n1.random = n2;
        n2.random = n1;

        System.out.println(new CopyListWithRandomPointerSp1().copyRandomList(n1));

    }

}