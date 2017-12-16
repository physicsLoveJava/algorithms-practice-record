package books.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MazeOneTest {
    @Test
    public void solve() throws Exception {
        int[][] maze = {
                {2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 0, 2, 0, 2, 0, 2},
                {2, 0, 0, 2, 0, 2, 2},
                {2, 2, 0, 2, 0, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2},
        };
        int startX = 1;
        int startY = 1;
        int endX = 5;
        int endY = 5;

        MazeOne.solve(maze, 7, startX, startY, endX, endY);
    }

    @Test
    public void solve2() throws Exception {
        int[][] maze = {
                {2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 0, 2, 0, 2, 0, 2},
                {2, 0, 0, 2, 0, 2, 2},
                {2, 2, 0, 2, 0, 2, 2},
                {2, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2},
        };
        int startX = 1;
        int startY = 1;
        int endX = 3;
        int endY = 4;

        MazeOne.solve(maze, 7, startX, startY, endX, endY);
    }



}