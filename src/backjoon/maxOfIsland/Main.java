package backjoon.maxOfIsland;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] arr = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 1, 1}
        };

        System.out.println(main.solutionBFS(arr));
    }

    private int solutionBFS(int[][] arr) {
        int count = 0;
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    area++;
                    count = Math.max(count, bfs(arr, i, j));
                }
            }
        }

        System.out.println(area);
        return count;
    }

    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private int bfs(int[][] arr, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        Queue<Integer> sumQueue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        sumQueue.offer(1);
        arr[i][j] = -1;

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            Integer poll = sumQueue.poll();

            for (int[] dir : dirs) {
                int x1 = point[0] + dir[0];
                int y1 = point[1] + dir[1];
                if (x1 >= 0 && x1 < arr.length && y1 >= 0 && y1 < arr[0].length && arr[x1][y1] == 1) {
                    arr[x1][y1] = -1;
                    queue.offer(new int[]{x1, y1});
                    poll++;
                }
            }
            sumQueue.offer(poll);
        }


        return sumQueue.poll();
    }

}
