package inflearn.sort.중복확인;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1:20
 */
public class Main {

    public char solution(int[] arr) {
        Arrays.sort(arr);

        int before = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == before) {
                return 'D';
            }

            before = arr[i];
        }

        return 'U';
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        char answer = T.solution(arr);
        System.out.println(answer);

    }

}
