package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/beautiful-arrangement
 */
public class BeautifulArrangementSp1 {

    static int size = 0;

    public int countArrangement(int n) {
        if(n < 1) {
            return 0;
        }
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        permute(arr, 1);
        return size;
    }

    private void permute(int[] arr, int idx) {
        if(idx == arr.length) {
            size++;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, i, idx);
            if(isBeautiful(arr, idx)) {
                permute(arr, idx + 1);
            }
            swap(arr, i, idx);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private boolean isBeautiful(int[] arr, int idx) {
        return (arr[idx] % idx) == 0 || (idx % arr[idx]) == 0;
    }

}
