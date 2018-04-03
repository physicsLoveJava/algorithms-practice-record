package company.netease;

import java.util.Scanner;

public class Game2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10000];
        int[] bucks = new int[10000];
        int i = 0;
        while(scanner.hasNext()) {
            arr[i++] = scanner.nextInt();
        }
        for (int j = 0; j < i; j++) {
            bucks[arr[j]] += 1;
        }
        System.out.println(computeMax(bucks));
    }

    private static int computeMax(int[] bucks) {
        int pick = 0, unpick = 0, prev = -1;
        for (int key = 0; key < bucks.length; key++) {
            int curMax = Math.max(pick, unpick);
            if(key - 1 != prev) {
                pick = key * bucks[key] + curMax;
                unpick = curMax;
            }else {
                pick = key * bucks[key] + unpick;
                unpick = curMax;
            }
            prev = key;
        }
        return Math.max(pick, unpick);
    }

}
