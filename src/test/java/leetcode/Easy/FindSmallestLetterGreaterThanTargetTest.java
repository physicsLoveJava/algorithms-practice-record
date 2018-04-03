package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindSmallestLetterGreaterThanTargetTest {
    @Test
    public void nextGreatestLetter() throws Exception {

        assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                        'c', 'f', 'j'
                },
                'a'
        ));

        assertEquals('f', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                        'c', 'f', 'j'
                },
                'c'
        ));

        assertEquals('f', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                        'c', 'f', 'j'
                },
                'd'
        ));

        assertEquals('j', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                        'c', 'f', 'j'
                },
                'g'
        ));

        assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                        'c', 'f', 'j'
                },
                'j'
        ));

        assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                        'c', 'f', 'j'
                },
                'k'
        ));

        assertEquals('n', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(
                new char[] {
                       'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n'
                },
                'e'
        ));

    }

}