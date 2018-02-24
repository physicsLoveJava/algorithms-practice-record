package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/image-smoother
 */
public class ImageSmoother {

    public int[][] imageSmoother(int[][] m) {
        if(m == null || m.length == 0) {
            return null;
        }
        int[][] rs = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                rs[i][j] = getRs(m, i, j);
            }
        }
        return rs;
    }

    private int getRs(int[][] m, int i, int j) {
        List<Pair> list = getData(m, i, j);
        double ks = 0;
        double vs = 0;
        for (Pair pair : list) {
            ks += pair.k;
            vs += pair.v;
        }
        return (int) Math.floor(ks / vs);
    }

    private List<Pair> getData(int[][] m, int i, int j) {
        List<Pair> list = new ArrayList<>();
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                Pair pair = new Pair();
                if(RangeCheck(m, i + k, j + l)) {
                    pair.v = 1;
                    pair.k = m[i + k][j + l];
                }else {
                    pair = new Pair();
                    pair.v = 0;
                    pair.k = 0;
                }
                list.add(pair);
            }
        }
        return list;
    }

    private boolean RangeCheck(int[][] m, int i, int j) {
        if(i < 0 || i > m.length -1
               || j < 0 || j > m[0].length - 1) {
            return false;
        }
        return true;
    }

    class Pair {
        int k;
        int v;
    }
}
