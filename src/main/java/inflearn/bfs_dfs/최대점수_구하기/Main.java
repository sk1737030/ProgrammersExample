package inflearn.bfs_dfs.최대점수_구하기;

import java.util.Scanner;

/**
 * 40분 걸림
 * 다시 풀기
 */
public class Main {

    int answer = 0;

    public int solution(int n, int m, int[][] arr) {
        answer = 0;
        DFS(m, arr, 0, 0, 0);

        return answer;
    }

    private void DFS(int limitTime, int[][] arr, int index, int sum, int sumTime) {
        if (index > arr.length || sumTime > limitTime) {
            return;
        } else if (index == arr.length) {
            answer = Math.max(sum, answer);
        } else {
            DFS(limitTime, arr, index + 1, sum + arr[index][0], sumTime + arr[index][1]);
            DFS(limitTime, arr, index + 1, sum, sumTime);
        }

    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}
