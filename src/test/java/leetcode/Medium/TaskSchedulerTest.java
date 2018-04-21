package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSchedulerTest {
    @Test
    public void leastInterval() throws Exception {

        assertEquals(8, new TaskScheduler().leastInterval(
                new char[]{
                        'A', 'A', 'A', 'B', 'B', 'B'
                },
                2
        ));

        assertEquals(8, new TaskScheduler().leastInterval(
                new char[]{
                        'A', 'A', 'A', 'B', 'B', 'B', 'C'
                },
                2
        ));

    }

}