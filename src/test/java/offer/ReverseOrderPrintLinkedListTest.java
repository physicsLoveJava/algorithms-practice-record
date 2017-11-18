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

        FunctionalUtils.map(nodes, new FunctionalUtils.Callback<LinkNode>() {

            @Override
            public LinkNode each(LinkNode item, int index, LinkNode[] arr) {
                System.out.println(item.getData());
                return null;
            }

        });
        ReverseOrderPrintLinkedList.reverse(nodes[0]);
    }

}