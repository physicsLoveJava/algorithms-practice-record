package offer;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurrenceInArray {

    //TODO
    public static int findWithTimes(int[] array) {
        if(array == null) {
            return -1;
        }
        int times = 0;
        int last = array[0];
        for (int x : array) {
            if(times == 0) {
                last = x;
                times = 1;
            }else {
                if(x == last) {
                    times ++;
                }else {
                    times --;
                }
            }
        }
        return isValid(array, last) ? last : -1;
    }

    public static int findWithPartition(int[] array) {
        if(array == null) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int idx = partition(array, start, end);
        int mid = array.length >> 1;
        while(idx != mid) {
            if(idx < mid) {
                start = idx + 1;
                idx = partition(array, start, end);
            }else {
                end = idx - 1;
                idx = partition(array, start, end);
            }
        }
        int result = array[idx];
        return isValid(array, result) ? result : -1;
    }

    private static boolean isValid(int[] array, int result) {
        int cnt = 0;
        for (int x : array) {
            if(x == result) {
                cnt ++;
            }
        }
        return cnt >= array.length >> 1;
    }

    private static int partition(int[] array, int start, int end) {
        if(start > end) {
            return -1;
        }
        if(start == end) {
            return start;
        }
        int left = start;
        int right = end;
        int pivot = array[start];
        while(left < right) {
            while(array[right] > pivot && left < right) {
                right--;
            }
            while(array[left] < pivot && left < right) {
                left++;
            }
            if(left < right) {
                ArrayUtils.swap(array, left++, right--);
            }
        }
        ArrayUtils.swap(array, left, start);
        return left;
    }

    public static int find(int[] array) {
        if(array == null) {
            return -1;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            putOrIncValue(map, array[i]);
        }
        int max = 0;
        int key = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return max > array.length >> 1 ? key : -1;

    }

    private static void putOrIncValue(Map<Integer, Integer> map, int value) {
        if(map.containsKey(value)) {
            map.put(value, map.get(value) + 1);
        }else {
            map.put(value, 1);
        }
    }

}
