package offer;

import org.junit.Test;
import util.adt.BinaryTreeNode;

import static org.junit.Assert.*;

public class ReconstructBinaryTreeTest {

    /**
     *
     * Binary Tree
     *       3
     *    4     5
     *
     *  7           9
     *     8
     *
     *
     * pre: 3, 4, 7, 8, 5, 9
     * in: 7, 8, 4, 3, 5, 9
     *
     * @throws Exception
     */
    @Test
    public void reconstruct() throws Exception {
        BinaryTreeNode<Integer> node = ReconstructBinaryTree.reconstruct(new int[]{3, 4, 7, 8, 5, 9},
                new int[]{7, 8, 4, 3, 5, 9});
        System.out.println(node);
    }

}