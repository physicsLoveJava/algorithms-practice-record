package util;

import com.google.common.base.Joiner;
import util.adt.BinaryTreeNode;

import java.util.Arrays;

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

    public static <T> void printBinaryTree(BinaryTreeNode<T> node) {

    }

    public static <E> void printArray(E[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printMatrix(int[][] val, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d, ", val[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] val) {
        printMatrix(val, 0);
    }

    public static void printMatrix(int[][] val, int deg) {
        if(val == null) {
            return;
        }
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                if(deg > 0) {
                    System.out.printf("%" + deg + "d, ", val[i][j]);
                }else {
                    System.out.printf("%d, ", val[i][j]);
                }
            }
            System.out.println();
        }
    }

}
