package inflearn.bfs_dfs.합이_같은_부분집합;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 다시 풀기
 * DFS
 */

public class Main {

    String answer = "NO";
    int n;
    int total;
    boolean flag = false;


    public String solution(int n, int[] arr) {
        this.n = n;
        this.total = Arrays.stream(arr).sum();

        DFS(0, 0, arr);
        return answer;
    }

    private void DFS(int index, int sum, int[] arr) {
        if (flag) {
            return;
        }

        if (index == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(index + 1, sum + arr[index], arr);
            DFS(index + 1, sum, arr);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String answer = T.solution(n, arr);
        System.out.println(answer);
    }


}
