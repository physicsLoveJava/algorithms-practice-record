package leetcode.contest.c5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuitableParCopy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int count = in.nextInt();
            List<String> list = new ArrayList<>();
            cal(count, 0, count * 2, "", list);
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    System.out.print(list.get(i));
                } else {
                    System.out.print("," + list.get(i));
                }
            }
        }
    }

    public static void cal(int a, int b, int count, String s, List<String> list) {
        if (s.length() == count) {
            list.add(s);
            return;
        }
        if (a != 0)
            cal(a - 1, b + 1, count, s + "(", list);
        if (b != 0)
            cal(a, b - 1, count, s + ")", list);
    }

}
