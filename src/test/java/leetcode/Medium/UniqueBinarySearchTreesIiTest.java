package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesIiTest {
    @Test
    public void generateTrees() throws Exception {

        assertEquals(0, new UniqueBinarySearchTreesIi().generateTrees(0).size());
        assertEquals(1, new UniqueBinarySearchTreesIi().generateTrees(1).size());
        assertEquals(2, new UniqueBinarySearchTreesIi().generateTrees(2).size());
        assertEquals(5, new UniqueBinarySearchTreesIi().generateTrees(3).size());

    }

}