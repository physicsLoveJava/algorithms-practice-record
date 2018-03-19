package leetcode.Medium;

import org.junit.Test;
import util.CreationUtils;
import util.adt.ListNode;

public class PartitionListTest {
    @Test
    public void partition() throws Exception {

        ListNode list = CreationUtils.listNode(new int[] {1, 4, 3, 2, 5, 2});

        System.out.println(new PartitionList().partition(list, 3));
    }

    @Test
    public void partition2() throws Exception {

        ListNode list = CreationUtils.listNode(new int[] {2, 1});
        System.out.println(new PartitionList().partition(list, 2));
    }

    @Test
    public void partition3() throws Exception {

        ListNode list = CreationUtils.listNode(new int[] {1, 3, 2});
        System.out.println(new PartitionList().partition(list, 3));
    }

}