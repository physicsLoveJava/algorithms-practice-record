package books.classic;

public class FindFakeCoin {

    public static int find(int[] coins) {
        if(coins == null || coins.length != 8) {
            return -1;
        }
        if(coins[0] + coins[1] + coins[2] ==
                coins[3] + coins[4] + coins[5]) {
            return coins[6] == coins[0] ? 7 : 6;
        }else {
            if(coins[0] + coins[1] == coins[3] + coins[4]) {
                return coins[2] == coins[0] ? 5 : 2;
            }else {
                if(coins[0] == coins[3]) {
                    return coins[1] == coins[7] ? 4 : 1;
                }else {
                    return coins[0] == coins[7] ? 3 : 0;
                }
            }
        }
    }

}
