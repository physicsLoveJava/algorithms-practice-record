package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class SplitLinkedListToOddAndEvenTest {
    @Test
    public void split() throws Exception {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 5);
        System.out.println(new SplitLinkedListToOddAndEven().split(head));
    }

    @Test
    public void split1() throws Exception {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 1);
        System.out.println(new SplitLinkedListToOddAndEven().split(head));
    }

    @Test
    public void split2() throws Exception {
        LinkNode<Integer> head = CreationUtils.linkedList(0, 2);
        System.out.println(new SplitLinkedListToOddAndEven().split(head));
    }

}