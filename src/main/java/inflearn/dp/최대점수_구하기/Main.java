package inflearn.dp.최대점수_구하기;

import java.util.Scanner;

/**
 * 다시 풀기 30분 지남
 */
public class Main {

    int score = 0;

    private void DFS(int sum, int totalTime, int totalScore, int index, int[][] arr) {

        if (sum < totalTime) {
            return;
        } else {
            score = Math.max(score, totalScore);

            if (index + 1 >= arr.length) {
                return;
            }

            DFS(sum, arr[index + 1][1] + totalTime, arr[index + 1][0] + totalScore, index + 1, arr);
            DFS(sum, totalTime, totalScore, index + 1, arr);
        }
    }

    public int solution(int n, int m, int[][] arr) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = Math.max(temp, score);
            score = 0;
            DFS(m, arr[i][1], arr[i][0], i, arr);
        }

        return temp;
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }

}
