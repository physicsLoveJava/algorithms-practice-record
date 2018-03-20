package leetcode.Medium;

import org.junit.Test;
import util.CreationUtils;
import util.adt.ListNode;

public class ReorderListTest {
    @Test
    public void reorderList() throws Exception {
        ListNode head = CreationUtils.listNode(new int[]{1, 2, 3, 4});
        System.out.println(head);
        new ReorderList().reorderList(head);
        System.out.println(head);
    }

    @Test
    public void reorderList2() throws Exception {
        ListNode head = CreationUtils.listNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(head);
        new ReorderList().reorderList(head);
        System.out.println(head);
    }

    @Test
    public void reorderList3() throws Exception {
        ListNode head = CreationUtils.listNode(new int[]{1, 2, 3});
        System.out.println(head);
        new ReorderList().reorderList(head);
        System.out.println(head);
    }

    @Test
    public void reorderList4() throws Exception {
        ListNode head = CreationUtils.listNode(new int[]{1, 2});
        System.out.println(head);
        new ReorderList().reorderList(head);
        System.out.println(head);
    }

}