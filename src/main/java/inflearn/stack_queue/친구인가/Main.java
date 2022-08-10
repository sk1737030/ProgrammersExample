package inflearn.stack_queue.친구인가;

import java.util.Scanner;

/**
 * Disjoint-Set : Union&Find
 */

public class Main {

    private String solution(int n, int m, int[][] arr) {
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][];

        arr[0][0] = n;
        arr[0][1] = m;

        for (int i = 1; i < n - 1; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Main T = new Main();
        String answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}