package inflearn.bfs_dfs.동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 다시 풀기
 * 시간 초과
 */
public class Main {

    int answer = Integer.MAX_VALUE;
    int lb = 0;

    public int solution(int n, int m, Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        DFS(n, m, arr, 0, 0);

        return answer;
    }

    private void DFS(int n, int m, Integer[] arr, int index, int sum) {

        if (sum > m || index >= n || lb >= answer) {
            return;
        }

        if (sum == m) {
            answer = Math.min(answer, lb);
        } else {
            lb++;
            for (int i = 0; i < n; i++) {
                DFS(n, m, arr, i, sum + arr[i]);
            }
            lb--;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}
