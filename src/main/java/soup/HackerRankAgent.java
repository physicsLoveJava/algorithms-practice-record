package soup;

import soup.impl.hackerrank.HackerRankFetcher;
import soup.impl.hackerrank.HackerRankProblemResolver;

public class HackerRankAgent extends AbstractAgent{

    public HackerRankAgent(String type, int threadCount) {
        this.type = type;
        fetcher = new HackerRankFetcher(type);
        resolver = new HackerRankProblemResolver();
        urlList = fetcher.fetch();
        this.threadCount = threadCount;
    }

}
