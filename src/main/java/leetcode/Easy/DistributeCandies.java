package leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/distribute-candies
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }

}
