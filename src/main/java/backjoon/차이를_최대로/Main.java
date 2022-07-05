package backjoon.차이를_최대로;

import java.util.Scanner;


/**
 * 차이를 최대로
 * https://www.acmicpc.net/problem/10819
 */
public class Main {
    private static int max = 0;

    public int solution(int[] arr) {
        combination(arr, arr.length, 0);
        return max;
    }

    private void combination(int[] arr, int length, int i) {
        int sum = 0;

        for (int j = 1; j < length; j++) {
            sum += Math.abs(arr[j - 1] - arr[j]);
        }

        max = Math.max(max, sum);

        for (int j = 0; j < length; j++) {
            if (i + 1 < length) {
                swap(arr, j, i + 1);
                combination(arr, length, i + 1);
                swap(arr, i + 1, j);
            }
        }
    }

    private void swap(int[] arr, int j, int i) {
        int tempValue = arr[j];
        arr[j] = arr[i];
        arr[i] = tempValue;
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
