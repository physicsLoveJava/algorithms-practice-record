package company.microsoft.c2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransferMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            int m = scanner.nextInt();
            Map<String, String> dict = new HashMap<>();
            scanner.nextLine();
            for (int j = 0; j < m; j++) {
                String[] s = scanner.nextLine().split(" ");
                dict.put(s[0], s[1]);
            }
            String sentence = scanner.nextLine();
            String message = transfer(sentence, dict, t);
            System.out.printf("Case #%s: %s\n", i + 1, message);
        }
    }

    private static String transfer(String sentence, Map<String, String> dict, int t) {
        String[] words = sentence.split(" ");
        while(t-- > 0) {
            for (int i = 0; i < words.length; i++) {
                if(dict.containsKey(words[i])) {
                    words[i] = dict.get(words[i]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        if(sb.length() == 0) {
            return "";
        }
        return sb.substring(0, sb.length() - 1);
    }

}
