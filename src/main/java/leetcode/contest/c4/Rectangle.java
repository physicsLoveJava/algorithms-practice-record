package leetcode.contest.c4;

import java.util.Scanner;

public class Rectangle {
    public static class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int t;
            int[][] m = new int[4][size];
            double[] r = new double[size];
            Point points[] = new Point[size];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < size; j++) {
                    t = sc.nextInt();
                    m[i][j] = t;
                }
            }
            for (int i = 0; i < size; i++) {
                points[i] = new Point((double) (m[0][i] + m[2][i]) / 2, (double) (m[1][i] + m[3][i]) / 2);
                r[i] = getDiff(m[0][i], m[1][i], m[2][i], m[3][i]);
            }
            int max = 1;

            for (int i = 0; i < size; i++) {
                int num = 0;
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (interact(points[i], points[j], r[i], r[j])) {
                        num++;
                    }
                }
                max = Math.max(max, num);
            }
            System.out.println(max);
        }

        public static double getDiff(int x1, int y1, int x2, int y2) {
            return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) / 2;
        }


        public static boolean interact(Point x, Point y, double r1, double r2) {
            return x.distance(y) <= r1 + r2;
        }

        static class Point {
            double x;
            double y;

            Point(double x, double y) {
                super();
                this.x = x;
                this.y = y;
            }

            public double distance(Point p) {
                return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
            }

        }
    }

}

