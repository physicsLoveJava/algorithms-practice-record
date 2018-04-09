package leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/course-schedule
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] row : prerequisites) {
            for (int pre : row) {
                if(pre == row[0]) {
                    continue;
                }
                if(!map.containsKey(row[0])) {
                    map.put(row[0], new ArrayList<>());
                }
                List<Integer> list = map.get(row[0]);
                list.add(pre);
                map.put(row[0], list);
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if(!dfs(map, visited, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Map<Integer, List<Integer>> map, boolean[] visited, int idx) {
        List<Integer> pre = map.get(idx);
        if(pre == null) {
            return true;
        }
        visited[idx] = true;
        boolean flag = true;
        for (Integer i : pre) {
            if(visited[i] || (!visited[i] && !dfs(map, visited, i))) {
                flag = false;
                break;
            }
        }
        visited[idx] = false;
        return flag;
    }

}
