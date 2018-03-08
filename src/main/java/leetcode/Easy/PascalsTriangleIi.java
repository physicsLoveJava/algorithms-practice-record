package leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/pascals-triangle-ii
 */
public class PascalsTriangleIi {

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0) {
            return new ArrayList<>();
        }
        List<Integer> rs = new ArrayList<>(rowIndex + 1);
        int[] arr = new int[rowIndex + 1];
        arr[0] = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = i; j >= 1; j--) {
                arr[j] += arr[j - 1];
            }
        }
        for (int i : arr) {
            rs.add(i);
        }
        return rs;
    }

}
