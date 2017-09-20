package leetcode.ex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementTriePrefixTreeExTest {

    ImplementTriePrefixTreeEx tree;

    @Before
    public void setUp() {
        tree = new ImplementTriePrefixTreeEx();
    }

    @Test
    public void print() throws Exception {

        tree.insert("a");
        tree.insert("ab");
        tree.insert("ac");
        tree.insert("abcde");
        tree.insert("bcdf");

        tree.print();
    }

}