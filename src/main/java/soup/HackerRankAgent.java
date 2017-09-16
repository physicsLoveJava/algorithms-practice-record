package soup;

import soup.impl.HackerRankFetcher;
import soup.impl.HackerRankProblemResolver;
import soup.support.ProblemResolver;
import soup.support.UrlListFetcher;

import java.util.Iterator;
import java.util.List;

public class HackerRankAgent implements Iterable<String>{

    UrlListFetcher fetcher;

    ProblemResolver resolver;

    List<String> urlList;

    int threadCount;

    private UrlIterator iterator;

    public HackerRankAgent(String type, int threadCount) {
        fetcher = new HackerRankFetcher(type);
        resolver = new HackerRankProblemResolver();
        urlList = fetcher.fetch();
        this.threadCount = threadCount;
    }

    public void run() {
        int count = this.threadCount < 1 ? 4 : this.threadCount;
        Thread[] threads = new Thread[count];
        for (int i = 0; i < threads.length; i++) {
            UrlWorker worker = new UrlWorker(resolver, this.iterator());
            threads[i] = new Thread(worker);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("task completed!");
    }

    public Iterator<String> iterator() {
        if(iterator == null) {
            iterator = new UrlIterator();
        }
        return iterator;
    }

    public class UrlWorker implements Runnable {

        ProblemResolver resolver;

        Iterator<String> iterator;

        public UrlWorker(ProblemResolver resolver, Iterator<String> iterator) {
            this.resolver = resolver;
            this.iterator = iterator;
        }

        public void run() {
            while(iterator.hasNext()) {
                resolver.resolve(iterator.next());
            }
        }
    }

    private class UrlIterator implements Iterator<String> {

        int cur = 0;

        public synchronized boolean hasNext() {
            int size;
            size = urlList.size();
            return cur < size;
        }

        public synchronized String next() {
            String url;
            try {
                url = urlList.get(cur);
            }catch (IndexOutOfBoundsException e) {
                throw new IllegalStateException("out of index of url list", e);
            }
            cur ++;
            return url;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
