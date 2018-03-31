package company.microsoft.c6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BroswerCaching {

    static class CacheStorage extends LinkedHashMap<String, Integer> {

        int size;

        public CacheStorage(int m) {
            super();
            this.size = m;
        }

        public void add(String url) {
            put(url, 1);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > size;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        CacheStorage store = new CacheStorage(m);
        for (int i = 0; i < n; i++) {
            String url = scanner.next();
            if(store.containsKey(url)) {
                System.out.println("Cache");
            }else {
                store.add(url);
                System.out.println("Internet");
            }
        }

    }

}
