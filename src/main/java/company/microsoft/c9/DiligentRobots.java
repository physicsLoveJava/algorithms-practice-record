package company.microsoft.c9;

import java.util.Scanner;

public class DiligentRobots {

    static int curMin = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(findMin(n, q, q, 0, 1));
    }

    private static int findMin(int n, int q, int cur, int level, int robots) {
        if(n <= 0) {
            if(curMin > level) {
                curMin = level;
            }
            return level;
        }
        if(level > curMin) {
            return curMin;
        }
        int tmp = findMin(n - robots, q, cur, level + 1, robots);
        int nt;
        if(cur == 0) {
            cur = q;
            nt = findMin(n - robots * 2, q, cur, level + 1, robots * 2);
        }else {
            nt = findMin(n, q, cur - 1, level + 1, robots);
        }
        return Math.min(tmp, nt);
    }

}
