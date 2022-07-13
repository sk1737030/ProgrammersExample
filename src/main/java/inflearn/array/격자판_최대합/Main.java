package inflearn.array.격자판_최대합;

import java.util.Scanner;

/**
 * 다시 풀기 손도못댐
 */
public class Main {

    public int solution(int[][] board) {
        int n = board.length;
        int answer = Integer.MIN_VALUE;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += board[i][j];
                sum2 += board[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += board[i][i];
        }

        for (int i = n - 1; i >= 0; i--) {
            sum2 += board[i][i];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
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
