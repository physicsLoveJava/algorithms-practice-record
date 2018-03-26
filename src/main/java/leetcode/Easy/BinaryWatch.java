package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/binary-watch
 */
public class BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        if(num < 0 || num > 8) {
            return new ArrayList<>();
        }
        List<String> rs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if(num - i >= 0 && num - i <= 5) {
                rs.addAll(binaryWatch(i, num - i));
            }
        }
        return rs;
    }

    private List<? extends String> binaryWatch(int a, int b) {
        List<Integer> hBits = height(a);
        List<Integer> lBits = lower(b);
        List<String> list = new ArrayList<>();
        for (Integer hBit : hBits) {
            for (Integer lBit : lBits) {
                list.add(String.format("%d:%02d", hBit, lBit));
            }
        }
        return list;
    }

    static int[] hArr = new int[] {
            1, 2, 4, 8
    };

    static int[] lArr = new int[] {
            1, 2, 4, 8, 16, 32
    };

    private List<Integer> lower(int b) {
        List<Integer> rs = new ArrayList<>();
        lower(rs, b, 0, 0);
        return rs;
    }

    private void lower(List<Integer> rs, int b, int val, int idx) {
        if(idx > lArr.length - 1 && b == 0 && val < 60) {
            rs.add(val);
            return;
        }
        if(idx > lArr.length - 1 || b < 0) {
            return;
        }
        lower(rs, b, val, idx + 1);
        lower(rs, b - 1, val + lArr[idx], idx + 1);
    }

    private List<Integer> height(int a) {
        List<Integer> rs = new ArrayList<>();
        height(rs, a, 0, 0);
        return rs;
    }

    private void height(List<Integer> rs, int a, int val, int idx) {
        if(idx > hArr.length - 1 && a == 0 && val < 12) {
            rs.add(val);
            return;
        }
        if(idx > hArr.length - 1 || a < 0) {
            return;
        }
        height(rs, a, val, idx + 1);
        height(rs, a - 1, val + hArr[idx], idx + 1);
    }

}
