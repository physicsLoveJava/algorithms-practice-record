package types.string;

public class StringMatchingBF {

    public int match(String text, String pattern) {
        if (text == null || pattern == null) {
            return -1;
        }
        for (int i = 0; i < text.length(); i++) {
            boolean found = true;
            for (int j = 0; j < pattern.length(); j++) {
                if(text.charAt(i + j) == pattern.charAt(j)) {
                    continue;
                }else {
                    found = false;
                    break;
                }
            }
            if(found) {
                return i;
            }
        }
        return -1;
    }

}
