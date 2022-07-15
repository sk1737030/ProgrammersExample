package inflearn.array.봉우리;

import java.util.Scanner;

public class Main {


    public int solution(int[][] board) {
        int answer = 0;

        int[][] extendedBoard = new int[board.length + 2][board.length + 2];
        for (int i = 1; i < extendedBoard.length - 1; i++) {
            for (int j = 1; j < extendedBoard.length - 1; j++) {
                extendedBoard[i][j] = board[i - 1][j - 1];
            }
        }

        for (int i = 1; i < extendedBoard.length - 1; i++) {
            for (int j = 1; j < extendedBoard.length - 1; j++) {
                int value = extendedBoard[i][j];

                if (value > extendedBoard[i + 1][j] && value > extendedBoard[i - 1][j] &&
                    value > extendedBoard[i][j + 1] && value > extendedBoard[i][j - 1]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n ][n ];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(board);
        System.out.println(answer);
    }

}
