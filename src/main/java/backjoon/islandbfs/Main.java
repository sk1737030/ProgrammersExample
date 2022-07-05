package backjoon.islandbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[][] arr = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 1, 0}
        };

        System.out.println(main.solutionBFS(arr));
    }

    private int solutionBFS(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    bfs(arr, i, j);
                }
            }
        }

        return count;
    }

    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private void bfs(int[][] arr, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] point = queue.poll();
            for (int k = 0; k < size; k++) {
                for (int[] dir : dirs) {
                    int x1 = point[0] + dir[0];
                    int y1 = point[1] + dir[1];
                    if (x1 >= 0 && y1 >= 0 && x1 < arr.length && y1 < arr[0].length && arr[x1][y1] == 1) {
                        arr[x1][y1] = -1;
                        queue.offer(new int[]{x1, y1});
                    }
                }
            }
        }
    }
}
