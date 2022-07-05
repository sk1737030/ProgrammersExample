package inflearn.two_pointers.공통원소_구하기;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 다시 풀기
 */

public class Main {


    public Long[] solution(long[] arr1, long[] arr2) {

        TreeSet<Long> result = new TreeSet<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int arr1Index = 0;
        int arr2Index = 0;

        while (arr1Index != arr1.length && arr2Index != arr2.length) {
            long a1 = arr1[arr1Index];
            long a2 = arr2[arr2Index];

            if (a1 == a2) {
                result.add(arr1[arr1Index]);
                arr1Index++;
                arr2Index++;
            } else if (a1 < a2) {
                arr1Index++;
            } else {
                arr2Index++;
            }
        }

        return result.toArray(new Long[0]);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr1 = new long[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextLong();
        }

        int M = sc.nextInt();
        long[] arr2 = new long[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextLong();
        }

        Long[] solution = T.solution(arr1, arr2);

        for (Long aLong : solution) {
            System.out.printf(aLong + " ");
        }
    }

}
