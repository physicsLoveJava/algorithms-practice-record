package offer;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMinimalNumsOfArrayConcat {

    public static String find(int[] array) {
        if(array == null) {
            return "";
        }
        List<Integer> list = Arrays.asList(ArrayUtils.toObject(array));
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String p1 = String.valueOf(o1) + o2;
                String p2 = String.valueOf(o2) + o1;
                return p1.compareTo(p2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer x : list) {
            sb.append(x);
        }
        return sb.toString();
    }

}
