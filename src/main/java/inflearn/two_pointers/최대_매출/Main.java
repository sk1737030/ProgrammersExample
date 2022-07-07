package inflearn.two_pointers.최대_매출;

import java.util.Scanner;

/**
 * Time Out 다시풀기
 */

public class Main {

    public int solution(int[] arr, int m) {
        int answer = 0;
        int j = arr.length - 1;
        int j1 = 0;
        int i1 = 0;

        for (int k = 0; k < m; k++) {
            i1 += arr[k];
            j1 += arr[j - k];
        }

        answer = Math.max(j1, i1);
        j -= m;

        for (int i = m; i < (arr.length) / 2; i++) {

            i1 += arr[i] - arr[i - m];
            j1 += arr[j] - arr[j + m];

            answer = Math.max(answer, Math.max(i1, j1));
            j--;
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
