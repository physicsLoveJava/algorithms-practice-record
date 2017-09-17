package soup;

import soup.support.ProblemResolver;
import soup.support.UrlListFetcher;

import java.util.Iterator;
import java.util.List;

public abstract class AbstractAgent implements Iterable<String>{

    protected UrlListFetcher fetcher;

    protected ProblemResolver resolver;

    protected List<String> urlList;

    protected int threadCount;

    private AbstractAgent.UrlIterator iterator;

    AbstractAgent() {
        super();
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
