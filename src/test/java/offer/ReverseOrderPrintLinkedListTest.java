package offer;

import org.junit.Test;
import util.FunctionalUtils;
import util.PrintUtils;
import util.adt.LinkNode;

import static org.junit.Assert.*;

public class ReverseOrderPrintLinkedListTest {
    @Test
    public void reverse() throws Exception {

        int size = 10;

        LinkNode<Integer>[] nodes = new LinkNode[size];

        for (int i = size - 1; i > -1; i--) {
            nodes[i] = new LinkNode<Integer>(i, i == size - 1 ? null : nodes[i + 1]);
        }
        PrintUtils.println(nodes, new FunctionalUtils.Callback<LinkNode<Integer>, String>() {
            @Override
            public String each(LinkNode<Integer> item, int index, LinkNode<Integer>[] arr) {
                return item.getData().toString();
            }
        });
        ReverseOrderPrintLinkedList.reverse(nodes[0]);
    }

}