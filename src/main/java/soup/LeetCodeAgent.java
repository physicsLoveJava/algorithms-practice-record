package soup;

import soup.impl.leetcode.LeetCodeLevel;
import soup.impl.leetcode.LeetCodeFetcher;
import soup.impl.leetcode.LeetCodeProblemResolver;

public class LeetCodeAgent extends AbstractAgent {

    public LeetCodeAgent(LeetCodeLevel level, int threadCount) {
        fetcher = new LeetCodeFetcher(level);
        resolver = new LeetCodeProblemResolver();
        urlList = fetcher.fetch();
        this.threadCount = threadCount;
    }

}
