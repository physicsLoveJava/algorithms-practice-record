package util;

import com.google.common.base.Joiner;

import static util.FunctionalUtils.map;

public class PrintUtils {

    private static <T> String internalPrint(T[] arr) {
        return internalPrintWithCallback(arr, new FunctionalUtils.Callback<T,String>() {
            @Override
            public String each(T item, int index, T[] arr) {
                return item.toString();
            }
        });
    }

    private static <T> String internalPrintWithCallback(T[] arr, FunctionalUtils.Callback<T, String> cb) {
        return Joiner.on(" -> ").join(map(arr, cb, new String[0]));
    }

    public static <T> void print(T[] arr) {
        System.out.print(internalPrint(arr));
    }

    public static <T> void println(T[] arr) {
        System.out.println(internalPrint(arr));
    }

    public static <T> void print(T[] arr, FunctionalUtils.Callback<T, String> cb) {
        System.out.print(internalPrintWithCallback(arr, cb));
    }

    public static <T> void println(T[] arr, FunctionalUtils.Callback<T, String> cb) {
        System.out.println(internalPrintWithCallback(arr, cb));
    }
}
