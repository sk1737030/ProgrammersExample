package inflearn.stack_queue.연속_부분수열;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 다시 풀기
 */

public class Main {

    int answer = 0;

    public int solution(int n, int m, int[] arr) {
        int[] temp = new int[n];
        DFS(n, m, arr, temp, 0);
        return answer;
    }

    private void DFS(int n, int m, int[] arr, int[] temp, int i) {
        if (Arrays.stream(temp).sum() == m) {
            answer++;
        } else {
            for (int j = i; j < n; j++) {
                temp[i] = arr[j];
                DFS(n, m, arr, temp, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}
