package backjoon.차이를_최대로;

import java.util.Scanner;


/**
 * 차이를 최대로
 * https://www.acmicpc.net/problem/10819
 */
public class Main {
    public int solution(int[] arr) {
        int answer = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
                answer += Math.abs(arr[i - 1] - arr[i]);
            } else {
                swap(arr, i, i - 1);
                answer += Math.abs(arr[i] - arr[i - 1]);
            }
        }

        return answer;
    }

    private void swap(int[] arr, int i, int i2) {
        int temp = arr[i2];
        arr[i2] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Main solution = new Main();
        System.out.println(solution.solution(arr));
    }

}
