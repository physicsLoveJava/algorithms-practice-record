package leetcode.Medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/permutation-sequence
 */
public class PermutationSequence {

    public String getPermutation(int n, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = i * factorial[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        k -= 1;
        for (int i = n; i >= 1; i--) {
            int index = k / factorial[i - 1];
            k = k % factorial[i - 1];
            sb.append(list.get(index));
            list.remove(index);
        }
        return sb.toString();
    }


}
