package leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/shopping-offers
 */
public class ShoppingOffersSp1 {

    static Map<Integer, Integer> map;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        map = new HashMap<>();
        map.put(0, 0);
        int compute = compute(price, special, needs);
        System.out.println(map);
        return compute;
    }

    private int compute(List<Integer> singlePrice, List<List<Integer>> prices, List<Integer> needs) {
        Integer hash = hashList(needs);
        if (map.containsKey(hash)) {
            return map.get(hash);
        }
        int normalPrice = 0;
        for (int i = 0; i < needs.size(); i++) {
            normalPrice += needs.get(i) * singlePrice.get(i);
        }
        for (int i = 0; i < prices.size(); i++) {
            List<Integer> price = prices.get(i);
            boolean valid = true;
            List<Integer> copyNeeds = new ArrayList<>(needs);
            for (int j = 0; j < copyNeeds.size(); j++) {
                if (copyNeeds.get(j) >= price.get(j)) {
                    copyNeeds.set(j, copyNeeds.get(j) - price.get(j));
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                normalPrice = Math.min(normalPrice, compute(singlePrice, prices, copyNeeds) + price.get(price.size() - 1));
            }
        }
        map.put(hash, normalPrice);
        return normalPrice;
    }

    private Integer hashList(List<Integer> needs) {
        int hash = 0;
        for (int i = 0; i < needs.size(); i++) {
            hash = needs.get(i) + hash * 7;
        }
        return hash;
    }

}
