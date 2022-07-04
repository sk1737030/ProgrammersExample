package inflearn.array.등수구하기;

import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {

            for (int k : arr) {
                if (k > arr[i]) {
                    cnt++;
                }
            }

            answer[i] = cnt;
            cnt = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i : T.solution(arr)) {
            System.out.printf(i + " ");
        }
    }


}
