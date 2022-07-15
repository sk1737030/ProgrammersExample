package inflearn.bfs_dfs.바둑이_승차;

import java.util.Scanner;

public class Main {

    int answer = 0;

    public int solution(int n, int m, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            DFS(n, arr, 0, i);
        }

        return answer;
    }

    private void DFS(int total, int[] arr, int sum, int index) {
        if (sum > total) {
            return;
        } else if (index == arr.length) {
            answer = Math.max(sum, answer);
        } else {
            DFS(total, arr, sum + arr[index], index + 1);
            DFS(total, arr, sum, index + 1);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}
