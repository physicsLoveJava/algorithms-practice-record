package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/shopping-offers
 */
public class ShoppingOffers {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int[][][][][][] dp = new int[7][7][7][7][7][7];
        addSinglePriceToSpeical(special, price);
        int compute = compute(dp, special, needs);
        return compute;
    }

    private void addSinglePriceToSpeical(List<List<Integer>> special, List<Integer> price) {
        for (int i = 0; i < price.size(); i++) {
            List<Integer> single = new ArrayList<>();
            for (int j = 0; j < special.get(0).size() - 1; j++) {
                if(i == j) {
                    single.add(1);
                }else {
                    single.add(0);
                }
            }
            single.add(price.get(i));
            special.add(single);
        }
    }

    private int compute(int[][][][][][] dp, List<List<Integer>> prices, List<Integer> needs) {
        if(anyLessZero(needs)) {
            return -1;
        }
        if(allEqZero(needs)) {
            return 0;
        }
        if(getVal(dp, needs) != 0) {
            return getVal(dp, needs);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.size(); i++) {
            List<Integer> price = prices.get(i);
            removeNeeds(needs, price);
            int cp = compute(dp, prices, needs);
            if(cp != -1) {
                if(min > cp + price.get(price.size() - 1)) {
                    min = cp + price.get(price.size() - 1);
                }
            }
            addNeeds(needs, price);
        }
        setVal(dp, needs, min);
        return getVal(dp, needs);
    }

    private void setVal(int[][][][][][] dp, List<Integer> needs, int min) {
        dp
        [getWithDefault(needs, 0)]
        [getWithDefault(needs, 1)]
        [getWithDefault(needs, 2)]
        [getWithDefault(needs, 3)]
        [getWithDefault(needs, 4)]
        [getWithDefault(needs, 5)] = min;
    }

    private void addNeeds(List<Integer> needs, List<Integer> price) {
        for (int i = 0; i < needs.size(); i++) {
            Integer cur = needs.get(i);
            needs.set(i, cur + price.get(i));
        }
    }

    private void removeNeeds(List<Integer> needs, List<Integer> price) {
        for (int i = 0; i < needs.size(); i++) {
            Integer cur = needs.get(i);
            needs.set(i, cur - price.get(i));
        }
    }

    private int getVal(int[][][][][][] dp, List<Integer> needs) {
        return dp
                [getWithDefault(needs, 0)]
                [getWithDefault(needs, 1)]
                [getWithDefault(needs, 2)]
                [getWithDefault(needs, 3)]
                [getWithDefault(needs, 4)]
                [getWithDefault(needs, 5)]
                ;
    }

    private int getWithDefault(List<Integer> needs, int i) {
        if(i < needs.size()) {
            return needs.get(i);
        }
        return 0;
    }

    private boolean allEqZero(List<Integer> needs) {
        for (int i = 0; i < needs.size(); i++) {
            if(needs.get(i) == 0) {
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    private boolean anyLessZero(List<Integer> needs) {
        for (int i = 0; i < needs.size(); i++) {
            if(needs.get(i) < 0) {
                return true;
            }
        }
        return false;
    }

}
