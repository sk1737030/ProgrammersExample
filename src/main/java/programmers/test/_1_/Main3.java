package programmers.test._1_;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    int min = Integer.MAX_VALUE;

    public int solution(int[][] beginning, int[][] target) {

        for (int i = 0; i < beginning.length; i++) {
            for (int j = 0; j < beginning.length; j++) {
                int[][] clone = beginning.clone();

                for (int k = 0; k < clone.length; k++) {
                    if (clone[i][k] == 0) {
                        clone[i][k] = 0;
                    } else {
                        clone[i][k] = 1;
                    }
                }

                min = Math.min(BFS(clone, target, i, i), min);

                clone = beginning.clone();
                for (int k = 0; k < clone.length; k++) {
                    if (clone[i][k] == 0) {
                        clone[i][k] = 1;
                    } else {
                        clone[i][k] = 0;
                    }
                }

                min = Math.min(BFS(clone, target, i, i), min);
            }
        }

        return min;
    }

    private int BFS(int[][] clone, int[][] target, int x, int y) {
        int answer = 0;
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        int[][] tmp = new int[clone.length][clone[0].length];
        tmp[x][y] = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            int size = queue.size();
            for (int i = 0; i < size; i++) {

                if (tmp == target) {
                    return answer;
                }

                for (int j = 0; j < 4; j++) {
                    int nx = dx[j] + point.x;
                    int ny = dy[j] + point.y;

                    if (nx >= 0 && nx < clone.length && ny >= 0 && ny < clone[0].length && tmp[nx][ny] == 0) {
                        for (int k = 0; k < clone.length; k++) {
                            if (clone[nx][k] == 0) {
                                clone[nx][k] = 1;
                            } else {
                                clone[nx][k] = 0;
                            }
                        }
                        queue.offer(new Point(nx, ny));

                        for (int k = 0; k < clone.length; k++) {
                            if (clone[ny][k] == 0) {
                                clone[ny][k] = 1;
                            } else {
                                clone[ny][k] = 0;
                            }
                        }

                        queue.offer(new Point(nx, ny));
                    }
                }
            }

            answer++;
        }

        return Integer.MAX_VALUE;
    }


    public class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}