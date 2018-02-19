package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesTest {
    @Test
    public void numTrees() throws Exception {

        assertEquals(1, UniqueBinarySearchTrees.numTrees(0));
        assertEquals(1, UniqueBinarySearchTrees.numTrees(1));
        assertEquals(2, UniqueBinarySearchTrees.numTrees(2));
        assertEquals(5, UniqueBinarySearchTrees.numTrees(3));
        assertEquals(14, UniqueBinarySearchTrees.numTrees(4));
        assertEquals(42, UniqueBinarySearchTrees.numTrees(5));
        assertEquals(132, UniqueBinarySearchTrees.numTrees(6));

    }

}