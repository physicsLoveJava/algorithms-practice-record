package offer;

import util.adt.ComplexNode;

public class ComplexNodeCopy {

    public static ComplexNode copy(ComplexNode source) {
        if(source == null) {
            return null;
        }
        ComplexNode p = source;
        while(p != null) {
            p.setNext(new ComplexNode(p.getData(), p.getNext()));
            p = p.getNext().getNext();
        }

        p = source;
        while(p != null && p.getNext() != null) {
            p.getNext().setSibling(getNext(p.getSibling()));
            p = p.getNext().getNext();
        }

        ComplexNode p1 = source;
        ComplexNode p2 = null;
        ComplexNode result = null;
        while(p1 != null) {
            if(result == null) {
                p2 = p1.getNext();
                result = p2;
            }else {
                p2.setNext(p1.getNext());
                p2 = p2.getNext();
            }
            p1 = p1.getNext().getNext();
        }
        return result;
    }

    private static ComplexNode getNext(ComplexNode sibling) {
        return sibling == null ? null : sibling.getNext();
    }

}
