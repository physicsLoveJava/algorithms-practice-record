package leetcode.Medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementTriePrefixTreeTest {

    ImplementTriePrefixTree tree;

    @Before
    public void setUp() {
        tree = new ImplementTriePrefixTree();
    }

    @Test
    public void insert() throws Exception {
        tree.insert("a");
        tree.insert("b");
        tree.insert("c");
        tree.insert("d");
    }

    @Test
    public void search() throws Exception {
        tree.insert("a");
        tree.insert("ab");
        tree.insert("abc");
        tree.insert("abcdef");
        tree.insert("b");
        assertTrue(tree.search("abc"));
        assertTrue(tree.search("ab"));
        assertTrue(tree.search("a"));
        assertTrue(tree.search("b"));
        assertFalse(tree.search("c"));
        assertFalse(tree.search("abcde"));
    }

    @Test
    public void startsWith() throws Exception {
        tree.insert("a");
        tree.insert("ab");
        tree.insert("abc");
        tree.insert("b");
        assertTrue(tree.startsWith("ab"));
        assertTrue(tree.startsWith("a"));
        assertFalse(tree.startsWith("ac"));
    }

}