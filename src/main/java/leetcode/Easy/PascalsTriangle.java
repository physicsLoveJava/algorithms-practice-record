package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/pascals-triangle
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        if(numRows < 0) {
            throw new IllegalArgumentException();
        }
        if(numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            list.add(generateXRow(i, list));
        }
        return list;
    }

    private List<Integer> generateXRow(int row, List<List<Integer>> parent) {
        List<Integer> list = new ArrayList<>();
        if(row == 1) {
            list.add(1);
        }else {
            for (int i = 0; i < row; i++) {
                if(i == 0 || i == row - 1) {
                    list.add(1);
                }else {
                    list.add(parent.get(row - 2).get(i) + parent.get(row - 2).get(i - 1));
                }
            }
        }
        return list;
    }

}
