package util;

import util.adt.LinkNode;

public class FunctionalUtils {

    public static <T> T[] map(T[] arr, Callback<T> callback) {
        if(arr == null) {
            return null;
        }
        T[] result = (T[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = callback.each(arr[i], i, arr);
        }
        return result;
    }



    // interface

    public interface Callback<T>{
        T each(T item, int index, T[] arr);
    }



}
