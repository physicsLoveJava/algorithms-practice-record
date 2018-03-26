package leetcode.Medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/gray-code
 */
public class GrayCodeSp1 {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
        return result;
    }

}
