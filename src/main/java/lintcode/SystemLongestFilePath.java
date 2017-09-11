package lintcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * problem url: http://www.lintcode.com/zh-cn/problem/system-longest-file-path/?rand=true
 */
public class SystemLongestFilePath {

    /*
     * @param input: an abstract file system
     * @return: return the length of the longest absolute path to file
     */
    public static int lengthLongestPath(String input) {
        if(input == null || "".equals(input) || !input.contains(".")) {
            return 0;
        }
        String[] parts = input.split("\n");
        Map<Integer, String> map = new HashMap<Integer, String>();
        List<String> fileList = new ArrayList<String>();
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            int level = getLevel(part);
            if(level == 0) {
                map.put(level, part);
                if(part.contains(".")) {
                    fileList.add(part);
                }
            }else {
                String basePath = map.get(level - 1);
                if(part.contains(".")) {
                    fileList.add(basePath + "/" + removeTab(part));
                }else {
                    map.put(level, basePath + "/" + removeTab(part));
                }
            }
        }
        int max = 0;
        for (String file : fileList) {
            if(file.length() > max) {
                max = file.length();
            }
        }
        return max;
    }

    private static String removeTab(String part) {
        if(part == null) {
            return null;
        }
        while(part.startsWith("\t")) {
            part = part.substring(1);
        }
        return part;
    }

    private static int getLevel(String part) {
        if(part == null || "".equals(part)) {
            return -1;
        }
        int count = 0;
        while(part.startsWith("\t")) {
            count++;
            part = part.substring(1);
        }
        return count;
    }

}
