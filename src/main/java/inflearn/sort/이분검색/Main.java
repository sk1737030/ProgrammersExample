package inflearn.sort.이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int answer = 0;
        Arrays.sort(arr);

        while (left <= right) {
            int mid = (left + right) / 2;

            if (m > arr[mid]) {
                left = mid + 1;
            } else if (m < arr[mid]) {
                right = mid - 1;
            } else {
                answer = mid + 1;
                break;
            }
        }

        return answer;
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
