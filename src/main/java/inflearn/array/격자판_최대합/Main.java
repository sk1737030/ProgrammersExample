package inflearn.array.격자판_최대합;

import java.util.Scanner;

public class Main {

    public int solution(int[][] board) {


        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(board);
        System.out.println(answer);
    }


}
