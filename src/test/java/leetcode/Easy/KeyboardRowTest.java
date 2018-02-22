package leetcode.Easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KeyboardRowTest {
    @Test
    public void findWords() throws Exception {

        System.out.println(Arrays.toString(new KeyboardRow().findWords(new String[]{
                "Hello", "Alaska", "Dad", "Peace", "Zx"
        })));

        System.out.println(Arrays.toString(new KeyboardRow().findWords(new String[]{
                 "qwertyuiop"
        })));

    }

}