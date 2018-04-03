package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/guess-number-higher-or-lower
 */
public class GuessNumberHigherOrLower {

    private int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int start = 1, end = n;
        while(start <= end) {
            int mid = (start + end) >>> 1;
            switch (guess(mid)) {
                case 1:
                    start = mid + 1;
                    break;
                case -1:
                    end = mid - 1;
                    break;
                case 0:
                    return mid;
            }
        }
        return -1;
    }

}
