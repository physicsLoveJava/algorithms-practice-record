package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/beautiful-arrangement
 */
public class BeautifulArrangementSp2 {

    static int size;

    public int countArrangement(int n) {
        if(n < 1) {
            return 0;
        }
        size = 0;
        boolean[] visited = new boolean[n + 1];
        arrange(visited, 1);
        return size;
    }

    private void arrange(boolean[] visited, int idx) {
        if(idx == visited.length) {
            size++;
            return;
        }
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i] && isBeautiful(i, idx)) {
                visited[i] = true;
                arrange(visited, idx + 1);
                visited[i] = false;
            }
        }
    }

    private boolean isBeautiful(int i, int idx) {
        return i % idx == 0 || idx % i == 0;
    }

}
