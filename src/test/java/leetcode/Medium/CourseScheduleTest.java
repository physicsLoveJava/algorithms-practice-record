package leetcode.Medium;

import org.junit.Test;

public class CourseScheduleTest {
    @Test
    public void canFinish() throws Exception {

        System.out.println(new CourseSchedule().canFinish(3, new int[][]{
                {1, 0},
                {1, 2},
                {0, 1}
        }));

    }

}