package inflearn.array.가위바위보;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> solution(int[] a, int[] b) {

        List<String> results = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int ai = a[i];
            int bi = b[i];

            results.add(referee(ai, bi));
        }

        return results;
    }

    private String referee(int a, int b) {
        // 1 > 3, 1 < 2
        // 2 > 1, 2 < 3
        // 3 > 2, 3 < 1

        if (a == b) {
            return "D";
        }

        if (a == 1) {
            return b == 2 ? "B" : "A";
        } else if (a == 2) {
            return b == 3 ? "B" : "A";
        } else {
            return b == 1 ? "B" : "A";
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        List<String> arr = T.solution(A, B);
        arr.forEach(System.out::println);
    }


}
