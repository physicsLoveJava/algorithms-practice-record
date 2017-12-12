package offer;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FindUglyNumberTest {
    @Test
    public void find() throws Exception {

        Set<Integer> set = FindUglyNumber.find(150);
        System.out.println(set);

    }

}