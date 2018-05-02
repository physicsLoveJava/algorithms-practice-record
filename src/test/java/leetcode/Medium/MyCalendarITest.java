package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyCalendarITest {

    @Test
    public void testCalendar() {
        MyCalendarI.MyCalendar calendar = new MyCalendarI.MyCalendar();
        assertTrue(calendar.book(100, 200));
        assertTrue(calendar.book(300, 400));
        assertFalse(calendar.book(150, 170));
        assertFalse(calendar.book(50, 500));
        assertFalse(calendar.book(250, 500));
        assertTrue(calendar.book(250, 260));
    }

}