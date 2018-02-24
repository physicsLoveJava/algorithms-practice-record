package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PascalsTriangleTest {
    @Test
    public void generate() throws Exception {

        System.out.println(new PascalsTriangle().generate(1));
        System.out.println(new PascalsTriangle().generate(2));
        System.out.println(new PascalsTriangle().generate(3));
        System.out.println(new PascalsTriangle().generate(4));
        System.out.println(new PascalsTriangle().generate(5));

    }

}