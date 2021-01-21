package programmers.step1example.kakaoexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 크레인 인형뽑기 게임
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */
public class Kakao1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> bucket = new Stack<>();
        List<Stack<Integer>> boards = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = board.length - 1; j >= 0; j--) {
                if (board[j][i] > 0)
                    stack.push(board[j][i]);
            }
            boards.add(stack);
        }

        for (int j : moves) {
            int move = j - 1;

            Stack<Integer> eachBoard = boards.get(move);

            if (!eachBoard.isEmpty()) {
                Integer popInteger = eachBoard.pop();
                if (!bucket.isEmpty() && bucket.peek().equals(popInteger)) {
                    bucket.pop();
                    answer += 2;
                    continue;
                }

                bucket.push(popInteger);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Kakao1 kakao1 = new Kakao1();
        int[][] problem = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int[][] problem2 = {
                {0, 2, 0},
                {1, 2, 0},
                {2, 2, 1}
        };
        int[] moves2 = {1, 2, 2, 2, 1, 3};

        System.out.println(kakao1.solution(problem, moves)); // 4
        //System.out.println(kakao1.solution(problem2, moves2)); // 6
    }
}
