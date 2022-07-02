package inflearn.array.점수계산;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr) {
        int answer = 0, cnt = 0;

        for (int j : arr) {
            if (j == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr));
    }


}
