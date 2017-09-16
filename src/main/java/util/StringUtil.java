package util;

public class StringUtil {

    /**
     * transform str by separator into class name
     * e.g.
     * str = a-b-c, separator = -
     * result = ABC
     * @param str
     * @param separator
     * @return
     */
    public static String toClassName(String str, String separator) {
        if(str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int sep = separator.length();
        int idx = str.indexOf(separator);
        int prev = 0, next;
        while(idx < len) {
            if(idx == -1) {
                idx = len;
            }
            next = idx;
            sb.append(captialize(str.substring(prev, next)));
            prev = idx + sep;
            if(prev >= len) {
                break;
            }
            idx = str.indexOf(separator, prev);
        }
        return sb.toString();
    }

    /**
     * captialize
     * @param str
     * @return
     */
    public static String captialize(String str) {
        if(str == null) {
            return null;
        }
        if(str.length() == 0) {
            return "";
        }
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
    }
}
