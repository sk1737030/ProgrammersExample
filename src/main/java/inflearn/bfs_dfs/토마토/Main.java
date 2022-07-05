package inflearn.bfs_dfs.토마토;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] board, Queue<Point> arr) {
        int[][] dis = BFS(board, arr);
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }

            return answer;
        }

        return -1;
    }

    private int[][] BFS(int[][] board, Queue<Point> points) {
        int x = board.length;
        int y = board[0].length;
        int[][] dis = new int[x][y];

        while (!points.isEmpty()) {
            Point point = points.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < x && ny >= 0 && ny < y && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    points.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[point.x][point.y] + 1;
                }
            }
        }

        return dis;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        Queue<Point> arr = new LinkedList<>();
        int M = kb.nextInt();
        int N = kb.nextInt();

        int[][] board = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int tomato = kb.nextInt();
                board[i][j] = tomato;
                if (tomato == 1) {
                    arr.offer(new Point(i, j));
                }
            }
        }
        int solution = T.solution(board, arr);
        System.out.println(solution);
    }

}
