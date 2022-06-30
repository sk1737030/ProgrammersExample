package inflearn.dp.계단오르기;

import java.util.Scanner;

public class Main {

    static int[] dy;

    public int solution(int n) {
        dy = new int[n];
        dy[0] = 1;
        dy[1] = 2;

        for (int i = 2; i < n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n - 1];
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int answer = T.solution(N);
        System.out.println(answer);

    }


}


