package company.microsoft.c3;

public class ReduceInversionCount {

    public static void main(String[] args) {

        System.out.println(maximumReduce(new int[]{
                3, 1, 2
        }));

        System.out.println(maximumReduce(new int[]{
                1, 2, 3, 4, 5
        }));

    }

    public static int maximumReduce(int[] arr) {
        int count = inversion(arr);
        if(count == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    swap(arr, i, j);
                    int nCount = inversion(arr);
                    count = Math.min(nCount, count);
                    swap(arr, i, j);
                }
            }
        }
        return count;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static int inversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
