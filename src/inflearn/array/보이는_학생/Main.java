package inflearn.array.보이는_학생;

import java.util.Scanner;

public class Main {


    public int solution(int[] board) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int j : board) {
            if (max < j) {
                answer++;
                max = j;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] board = new int[N];

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextInt();
        }

        int answer = T.solution(board);
        System.out.println(answer);

    }


}
