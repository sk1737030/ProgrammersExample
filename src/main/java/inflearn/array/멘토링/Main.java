package inflearn.array.멘토링;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[][] arr) {
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                arr[n][m] = sc.nextInt();
            }
        }

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}
