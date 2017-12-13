package offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordInSentence {

    public static String reverse(String sentence) {

        if(sentence == null) {
            return null;
        }

        List<String> words = Arrays.asList(sentence.split(" "));
        Collections.reverse(words);
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb.append(str).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

}
