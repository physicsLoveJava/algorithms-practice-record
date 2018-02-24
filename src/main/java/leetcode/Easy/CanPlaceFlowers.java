package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/can-place-flowers
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed == null) {
            return false;
        }
        if(flowerbed.length == 0) {
            return n == 0;
        }

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(isPlantable(flowerbed, i)) {
                flowerbed[i] = 1;
                count ++;
            }
        }
        return count >= n;
    }

    private boolean isPlantable(int[] flowerbed, int i) {
        int k = 0, m = 0;
        if(i - 1 >= 0) {
            k = flowerbed[i - 1];
        }
        if(i + 1 <= flowerbed.length - 1) {
            m = flowerbed[i + 1];
        }
        return k + m + flowerbed[i] == 0;
    }

}
