package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Problem Url: https://leetcode.com/problems/find-k-pairs-with-smallest-sums
 */
public class FindKPairsWithSmallestSums {

    class Pair implements Comparable<Pair>{
        int a;
        int b;
        int sum;

        public int compareTo(Pair o) {
            return sum - o.sum;
        }
    }

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int cap = nums1.length * nums2.length;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(cap < 1 ? 10 : cap);
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                Pair pair = new Pair();
                pair.a = nums1[i];
                pair.b = nums2[j];
                pair.sum = nums1[i] + nums2[j];
                pq.add(pair);
            }
        }
        List<int[]> rs = new ArrayList<int[]>();
        while(!pq.isEmpty() && k-- > 0) {
            Pair pair = pq.poll();
            rs.add(new int[] {
                    pair.a, pair.b
            });
        }
        return rs;
    }

}
