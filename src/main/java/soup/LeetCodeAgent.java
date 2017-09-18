package soup;

import soup.impl.leetcode.LeetCodeLevel;
import soup.impl.leetcode.LeetCodeFetcher;
import soup.impl.leetcode.LeetCodeProblemResolver;

public class LeetCodeAgent extends AbstractAgent {

    public LeetCodeAgent(LeetCodeLevel level, int threadCount) {
        this.type = level.getLevel();
        fetcher = new LeetCodeFetcher(level);
        resolver = new LeetCodeProblemResolver();
        urlList = fetcher.fetch();
        this.threadCount = threadCount;
    }

}
