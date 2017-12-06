package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindOccurrenceInArrayTest {

    @Test
    public void find() throws Exception {

        assertEquals(-1, FindOccurrenceInArray.find(null));
        assertEquals(2, FindOccurrenceInArray.find(new int[]{1, 2, 2, 2, 3}));
        assertEquals(2, FindOccurrenceInArray.find(new int[]{0, 1, 5, 5, 1, 2, 2, 2, 2, 2, 2}));

    }

    @Test
    public void findWithPartition() throws Exception {

        assertEquals(-1, FindOccurrenceInArray.findWithPartition(null));
        assertEquals(2, FindOccurrenceInArray.findWithPartition(new int[]{1, 2, 2, 2, 3}));
        assertEquals(2, FindOccurrenceInArray.findWithPartition(new int[]{0, 1, 5, 5, 1, 2, 2, 2, 2, 2, 2}));

    }

    @Test
    public void findWithTimes() throws Exception {

        assertEquals(-1, FindOccurrenceInArray.findWithTimes(null));
        assertEquals(2, FindOccurrenceInArray.findWithTimes(new int[]{1, 2, 2, 2, 3}));
        assertEquals(2, FindOccurrenceInArray.findWithTimes(new int[]{0, 1, 5, 5, 1, 2, 2, 2, 2, 2, 2}));

    }

}