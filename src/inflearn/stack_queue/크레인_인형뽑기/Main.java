package inflearn.stack_queue.크레인_인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int doll = getDoll(move, board);
            if (doll != 0) {
                if (!stack.isEmpty() && stack.peek() == doll) {
                    answer += 2;
                    stack.pop();
                } else {
                    stack.push(doll);
                }
            }
        }

        return answer;
    }

    private int getDoll(int move, int[][] board) {
        int length = board.length;
        int j = move - 1;

        for (int i = 0; i < length; i++) {
            int doll = board[i][j];

            if (doll != 0) {
                board[i][j] = 0;
                return doll;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }

}
