package inflearn.bfs_dfs.미로탐색;

import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    public int solution(int[][] board1) {
        board1[0][0] = 1;
        DFS(board1, 0, 0);
        return answer;
    }

    public void DFS(int[][] board, int x, int y) {
        if (x == 6 && y == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx > -1 && nx < 7 && ny > -1 && ny < 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(board, nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int[][] board1 = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board1[i][j] = kb.nextInt();
            }
        }
        int solution = T.solution(board1);
        System.out.println(solution);
    }
}
