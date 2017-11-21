package offer.sort;

import org.apache.commons.lang3.ArrayUtils;

public class RadixSort {

    public static <E extends Integer> void sort(E[] arr, int digit) {
        if(arr == null) {
            return;
        }
        int len = getMaxLength(arr, digit);
        for (int i = 0; i < len; i++) {
            int[] counts = new int[digit];
            Object[] temp = new Object[arr.length];
            for (int j = 0; j < arr.length; j++) {
                counts[getNumber(arr[j], digit, i)] += 1;
            }
            for (int j = 1; j < counts.length; j++) {
                counts[j] += counts[j - 1];
            }
            for (int j = arr.length - 1; j >= 0; j--) {
                int idx = getNumber(arr[j], digit, i);
                temp[counts[idx] - 1] = arr[j];
                counts[idx] -= 1;
            }
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (E) temp[j];
            }
        }
    }

    private static <E extends Integer> int getNumber(E e, int digit, int pos) {
        if(e == null) {
            return 0;
        }
        int value = e.intValue();
        for (int i = 0; i < pos; i++) {
            value = value / digit;
        }
        return value % digit;
    }

    private static <E extends Integer> int getMaxLength(E[] arr, int digit) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i].intValue();
            int tmp = 0;
            while(value != 0) {
                value = value / digit;
                tmp ++;
            }
            if(tmp > len) {
                len = tmp;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] ints = {1, 111, 1111, 111111};
        System.out.println(getMaxLength(ArrayUtils.toObject(ints), 10));
        System.out.println(getNumber(11, 10, 0));
        System.out.println(getNumber(11, 10, 1));
    }

}
