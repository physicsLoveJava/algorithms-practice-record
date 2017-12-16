package books.classic;

public class MazeOne {

    private static boolean success = false;

    public static void solve(int[][] maze, int size, int startX, int startY, int endX, int endY) {
        printMaze(maze, size);
        visit(maze, size, startX, startY, endX, endY);
    }

    private static void visit(int[][] maze, int size, int startX, int startY, int endX, int endY) {
        if (!visit(maze, startX, startY, endX, endY)) {
            System.out.println("can't find a path in the maze");
        }else {
            printMaze(maze, size);
        }
    }

    private static boolean visit(int[][] maze, int startX, int startY, int endX, int endY) {
        maze[startX][startY] = 1;
        if(startX == endX && startY == endY) {
            success = true;
        }
        walkIfPossible(maze, startX, startY + 1, endX, endY);
        walkIfPossible(maze, startX + 1, startY, endX, endY);
        walkIfPossible(maze, startX, startY - 1, endX, endY);
        walkIfPossible(maze, startX - 1, startY, endX, endY);
        if(!success) {
            maze[startX][startY] = 0;
        }
        return success;
    }

    private static void walkIfPossible(int[][] maze, int startX, int startY, int endX, int endY) {
        if(!success && canWalk(maze[startX][startY])) {
            visit(maze, startX, startY, endX, endY);
        }
    }

    private static boolean canWalk(int val) {
        return val == 0;
    }

    private static void printMaze(int[][] maze, int size) {
        System.out.println("maze: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(isWall(maze[i][j])) {
                    System.out.printf("█");
                }else if(isPath(maze[i][j])) {
                    System.out.printf("◇");
                }else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isPath(int val) {
        return val == 1;
    }

    private static boolean isWall(int val) {
        return val == 2;
    }

}
