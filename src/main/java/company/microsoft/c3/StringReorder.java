package company.microsoft.c3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringReorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            Map<Character, Integer> map = new TreeMap<>();
            boolean isValid = true;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(rangeCheck(ch)) {
                   if(!map.containsKey(ch)) {
                       map.put(ch, 0);
                   }
                   map.put(ch, map.get(ch) + 1);
                }else {
                    isValid = false;
                    break;
                }
            }
            if(!isValid) {
                System.out.println("<invalid input string>");
            }else {
                StringBuilder sb = new StringBuilder();
                int max = 0;
                for (Integer value : map.values()) {
                    if(value != null) {
                        if(max < value) {
                            max = value;
                        }
                    }
                }
                while(max-- > 0) {
                    for (Character key : map.keySet()) {
                        Integer value = map.get(key);
                        if(value != null && value >= 1) {
                            sb.append(key);
                            map.put(key, value - 1);
                        }
                    }
                }
                System.out.println(sb.toString());
            }
        }

    }

    private static boolean rangeCheck(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

}
