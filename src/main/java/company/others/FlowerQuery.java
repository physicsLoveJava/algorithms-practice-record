package company.others;

import java.util.Arrays;
import java.util.Scanner;

public class FlowerQuery {

    static class Store {
        int[] arr;

        public Store(int m) {
            arr = new int[m];
        }

        public Store(int[] arr) {
            this.arr = arr;
        }

        public void setBit(int i) {
            int i1 = arr[i];
            arr[i] = i1 + 1;
        }

        public Store toBits() {
            return new Store(Arrays.copyOf(arr, arr.length));
        }

        public Store minus(Store store) {
            int[] x = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                x[i] = arr[i] - store.arr[i];
            }
            return new Store(x);
        }

        public int count() {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != 0) {
                    count ++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int q = scanner.nextInt();
            Store[] queryStore = new Store[n];
            if(n > 0) {
                queryStore[0] = new Store(m);
                queryStore[0].setBit(arr[0] - 1);
            }
            for (int i = 1; i < n; i++) {
                Store store = queryStore[i - 1];
                queryStore[i] = store.toBits();
                queryStore[i].setBit(arr[i] - 1);
            }
            for (int i = 0; i < q; i++) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                System.out.println(query(queryStore, l - 1, r - 1));
            }
        }

    }

    private static int query(Store[] queryStore, int l, int r) {
        if(l == 0) {
            return queryStore[r].count();
        }
        return queryStore[r].minus(queryStore[l - 1]).count();
    }

}
