package offer;

import java.util.HashMap;

public class FindOnlyShowOnceCharacter {

    public static Character find(String str) {
        if(str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            putOrUpdate(map, chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == 1) {
                return chars[i];
            }
        }
        return null;
    }

    private static void putOrUpdate(HashMap<Character, Integer> map, char aChar) {
        if(!map.containsKey(aChar)) {
            map.put(aChar, 0);
        }
        map.put(aChar, map.get(aChar) + 1);
    }

}
