package leetcode.Medium;

/**
 * https://leetcode.com/problems/is-graph-bipartite/description/
 */
public class IsGraphBipartie {

    public boolean isBipartite(int[][] graph) {
        if(graph == null || graph.length == 0) {
            return true;
        }
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0 && !isBipartite(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isBipartite(int[][] graph, int[] colors, int color, int idx) {
        if(colors[idx] != 0) {
            return colors[idx] == color;
        }
        int[] row = graph[idx];
        colors[idx] = color;
        for (int cell : row) {
            if(!isBipartite(graph, colors, -1 * color, cell)) {
                return false;
            }
        }
        return true;
    }


}
