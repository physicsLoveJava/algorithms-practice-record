package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalUtils {

    public static <T, S> S[] map(T[] arr, Callback<T, S> callback, S[] typeS) {
        if(arr == null) {
            return null;
        }
        List<T> arrList = Arrays.asList(arr);
        List<S> tarList = new ArrayList<S>();
        for (int i = 0; i < arrList.size(); i++) {
            tarList.add(callback.each(arrList.get(i), i, arr));
        }
        return tarList.toArray(typeS);
    }

    public static <T, S> S reduce(T[] arr, ReduceCallback<T, S> callback, S initVal) {
        if(arr == null) {
            return null;
        }
        if(initVal == null) {
            throw new IllegalArgumentException("init value should be accessible");
        }
        for (int i = 0; i < arr.length; i++) {
            initVal = callback.reduce(initVal, arr[i], arr);
        }
        return initVal;
    }

    public static <T, S> S join(T[] arr, JoinCallback<T, S> callback, S initValue) {
        if(arr == null) {
            return null;
        }
        S initVal = initValue;
        for (int i = 0; i < arr.length - 1; i++) {
            if(initVal == null) {
                initVal = callback.join(arr[i], arr[i + 1]);
            }else {
                initVal = callback.merge(initVal, callback.join(arr[i], arr[i + 1]));
            }
        }
        return initVal;
    }

    // interface
    public interface Callback<T, S> {
        S each(T item, int index, T[] arr);
    }

    public interface JoinCallback<T, S> {
        S join(T prev, T next);

        S merge(S initVal, S cur);
    }

    public interface ReduceCallback<T, S> {
        S reduce(S cur, T next, T[] arr);
    }

}
