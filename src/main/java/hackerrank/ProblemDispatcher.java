package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lj167323
 */
public class ProblemDispatcher {

    public static void main(String[] args) {
        //System.out.println(ProblemDispatcher.dispatcherCount(new int[] {
        //    1, 2, 3
        //}));
        //System.out.println(ProblemDispatcher.dispatcherCount(new int[] {
        //    1, 2, 3, 4
        //}));
        //System.out.println(ProblemDispatcher.dispatcherCount(new int[] {
        //    1, 2, 3, 4, 5
        //}));
        //System.out.println(ProblemDispatcher.dispatcherCount(new int[] {
        //    1, 2, 3, 15
        //}));
        //System.out.println(ProblemDispatcher.dispatcherCount(new int[] {
        //    1, 2, 3, 15, 26, 37
        //}));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] problems = new int[n];
            for (int i = 0; i < n; i++) {
                problems[i] = scanner.nextInt();
            }
            System.out.println(dispatcherCount(problems));
        }
    }

    public static int dispatcherCount(int[] problems) {
        if(problems == null) {
            return 0;
        }
        Arrays.sort(problems);
        int count = 0;
        int last = -1;
        for (int i = 0; i < problems.length - 1; i++) {
            if(problems[i + 1] - problems[i] > 10) {
                int gapSize = i - last;
                count = calCount(count, gapSize);
                last = i;
            }
        }
        int gapSize = problems.length - 1 - last;
        count = calCount(count, gapSize);
        return count;
    }

    private static int calCount(int count, int size) {
        if(size % 3 != 0) {
            return count + (3 - size % 3);
        }
        return count;
    }

}
