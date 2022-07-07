package inflearn.two_pointers.최대_매출;

import java.util.Scanner;

/**
 * Time Out 다시풀기
 */

public class Main {

    public int solution(int[] arr, int m) {
        int answer = 0;
        int sum = 0;

        for (int k = 0; k < m; k++) {
            sum += arr[k];
        }

        answer = sum;

        for (int i = m; i < arr.length; i++) {
            sum += arr[i] - arr[i - m];

            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr, M));
    }

}
