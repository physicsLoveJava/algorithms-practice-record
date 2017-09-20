package leetcode.ex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementTriePrefixTreeEx2Test {
    ImplementTriePrefixTreeEx2 tree;

    @Before
    public void setUp() {
        tree = new ImplementTriePrefixTreeEx2();
    }

    @Test
    public void print() throws Exception {

        tree.insert("a");
        tree.insert("ac");
        tree.insert("abcde");
        tree.insert("a");
        tree.insert("ac");
        tree.insert("ac");
        tree.insert("ac");
        tree.insert("bcdf");
        tree.insert("ac");
        tree.insert("ac");

        tree.print();
    }

}