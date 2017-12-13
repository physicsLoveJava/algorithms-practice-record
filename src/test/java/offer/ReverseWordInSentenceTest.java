package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordInSentenceTest {
    @Test
    public void reverse() throws Exception {

        assertEquals("student. a am I", ReverseWordInSentence.reverse("I am a student."));

    }

}