package company.microsoft.c4;

import java.util.Scanner;

public class CombinationLock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        String lock = scanner.next();
        char[] chars = lock.toCharArray();
        for (int i = 0; i < s; i++) {
            scanner.next();
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    transform1(chars, scanner.nextInt(), scanner.nextInt(), scanner.next());
                    break;
                case 2:
                    transform2(chars, scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 3:
                    transform3(chars, scanner.nextInt());
                    break;
                case 4:
                    transform4(chars, scanner.nextInt(), scanner.nextInt(), scanner);
                    break;
            }
        }
        System.out.println(String.valueOf(chars));
    }

    private static void transform4(char[] chars, int i, int j, Scanner scanner) {
        if(i > j) {
            return;
        }
        transform4(chars, i + 1, j, scanner);
        transform2(chars, i, j, 1);
    }

    private static void transform3(char[] chars, int i) {
        i = i % chars.length;
        char[] tmp = new char[i];
        System.arraycopy(chars, 0, tmp, 0, i);
        System.arraycopy(chars, i, chars, 0, chars.length - i);
        System.arraycopy(tmp, 0, chars, chars.length - i, i);
    }

    private static void transform2(char[] chars, int i, int j, int k) {
        for (int l = i - 1; l < j; l++) {
            chars[l] = (char) (((chars[l] - 'A' + k) % 26) + 'A');
        }
    }

    private static void transform1(char[] chars, int i, int j, String next) {
        char ch = next.charAt(0);
        for (int k = i - 1; k < j; k++) {
            chars[k] = ch;
        }
    }

//    static class Test {
//        public static void main(String[] args) {
//            char[] chars = "abcdefg".toCharArray();
////            transform3(chars, 3);
////            transform1(chars, 1, 3, "z");
//            transform2(chars, 1, 3, 26);
//            System.out.println(String.valueOf(chars));
//        }
//    }
}
