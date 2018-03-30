package leetcode.contest.c6;

public class ArrangeWords {

    public int arrange(String[] arr) {
        if(arr == null || arr.length == 0) {
            return 1;
        }
        boolean[] visited = new boolean[arr.length];
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            found = found || dfs(arr, visited, i, arr.length);
        }
        return found ? 1 : -1;
    }

    private boolean dfs(String[] arr, boolean[] visited, int i, int rest) {
        if(i < 0 || i > arr.length -1) {
            return false;
        }
        if(rest == 1) {
            return true;
        }
        boolean found = false;
        visited[i] = true;
        for (int j = 0; j < arr.length; j++) {
            if(!visited[j] && arr[i].charAt(arr[i].length() - 1) == arr[j].charAt(0)) {
                found = dfs(arr, visited, j, rest - 1);
                break;
            }
        }
        visited[i] =false;
        return found;
    }

}
