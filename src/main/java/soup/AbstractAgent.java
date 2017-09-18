package soup;

import soup.support.ProblemResolver;
import soup.support.UrlListFetcher;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class AbstractAgent implements Iterable<String>{

    protected UrlListFetcher fetcher;

    protected ProblemResolver resolver;

    protected List<String> urlList;

    protected String type;

    protected int threadCount;

    private AbstractAgent.UrlIterator iterator;

    AbstractAgent() {
        super();
    }

    public void run() {
        int count = this.threadCount < 1 ? 4 : this.threadCount;
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(count);
        while(this.iterator().hasNext()) {
            executor.execute(new UrlWorker(resolver, this.iterator().next()));
        }
        while(executor.getTaskCount() != executor.getCompletedTaskCount()) {
            try {
                Thread.sleep(1000);
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

        String url;

        public UrlWorker(ProblemResolver resolver, String url) {
            this.resolver = resolver;
            this.url = url;
        }

        public void run() {
            try {
                resolver.resolve(type, url);
            }catch (Throwable e) {
                e.printStackTrace();
                System.out.println("run thread failed!");
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
