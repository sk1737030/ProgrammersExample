package inflearn.sort.마구간_정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);

        int answer = 0;
        int lt = 1;
        int rt = arr[arr.length - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(mid, arr) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    private int count(int mid, int[] arr) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - ep >= mid) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }

}
