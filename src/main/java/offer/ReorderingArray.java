package offer;

import org.apache.commons.lang3.ArrayUtils;

public class ReorderingArray {

    public static int[] makeOddBeforeEven(int[] arr) {
        if(arr == null) {
            return null;
        }
        int[] dest = new int[arr.length];
        System.arraycopy(arr, 0, dest, 0, arr.length);
        int i = 0;
        int j = dest.length - 1;
        while(i != j) {
            while(i < j && (dest[i] % 2 ) != 0) {i++;}
            while(i < j && (dest[j] % 2) == 0) {j--;}
            if(i < j) {
                ArrayUtils.swap(dest, i, j);
            }
        }
        return dest;
    }

    public static int[] makePositiveBeforeNegative(int[] arr) {
        if(arr == null) {
            return null;
        }
        int[] dest = new int[arr.length];
        System.arraycopy(arr, 0, dest, 0, arr.length);
        int i = 0;
        int j = dest.length - 1;
        while(i != j) {
            while(i < j && dest[i] > 0) {i++;}
            while(i < j && dest[j] < 0) {j--;}
            if(i < j) {
                ArrayUtils.swap(dest, i, j);
            }
        }
        return dest;
    }

    public static int[] makeXBeforeY(int[] arr, ConditionX conditionX) {
        if(arr == null) {
            return null;
        }
        int[] dest = new int[arr.length];
        System.arraycopy(arr, 0, dest, 0, arr.length);
        int i = 0;
        int j = dest.length - 1;
        while(i != j) {
            while(i < j && conditionX.makeX(dest[i])) {i++;}
            while(i < j && !conditionX.makeX(dest[j])) {j--;}
            if(i < j) {
                ArrayUtils.swap(dest, i, j);
            }
        }
        return dest;
    }

}
