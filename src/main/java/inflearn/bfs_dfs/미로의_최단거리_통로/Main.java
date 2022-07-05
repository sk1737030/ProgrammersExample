package inflearn.bfs_dfs.미로의_최단거리_통로;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public int solution(int[][] board) {
        int[][] dis = new int[7][7];
        BFS(board, dis);
        return dis[6][6] == 0 ? -1 : dis[6][6];

    }

    private void BFS(int[][] board, int[][] dis) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0));
        board[0][0] = 1;

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int[][] board = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int solution = T.solution(board);
        System.out.println(solution);
    }
}
