package types.linkedlist;

import org.junit.Test;
import util.CreationUtils;

import static org.junit.Assert.*;

public class DisplayLinkedListReverseTest {
    @Test
    public void displayReverse() throws Exception {

        new DisplayLinkedListReverse().displayReverse(CreationUtils.linkedList(0, 10));

    }

}