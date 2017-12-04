package offer;

import org.junit.Test;
import util.adt.ComplexNode;

import static org.junit.Assert.*;

public class ComplexNodeCopyTest {
    @Test
    public void copy() throws Exception {

        ComplexNode<String> a = new ComplexNode<>("a");
        ComplexNode<String> b = new ComplexNode<>("b");
        ComplexNode<String> c = new ComplexNode<>("c");
        ComplexNode<String> d = new ComplexNode<>("d");
        ComplexNode<String> e = new ComplexNode<>("e");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);

        a.setSibling(c);
        b.setSibling(e);
        d.setSibling(b);

        assertEquals(a.toString(), ComplexNodeCopy.copy(a).toString());

    }

}