package inflearn.bfs_dfs.섬나라_아일랜드;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {

    private static final int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static final int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int answer = 0;

    public static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] board) {
        int N = board.length;
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    queue.offer(new Point(i, j));
                    BFS(board, queue);
                }
            }
        }

        return answer;
    }

    private void BFS(int[][] board, Queue<Point> queue) {
        int length = board.length;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && nx < length && ny >= 0 && ny < length && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int i1 = sc.nextInt();
                board[i][j] = i1;
            }
        }

        int answer = T.solution(board);
        System.out.println(answer);
    }


}
