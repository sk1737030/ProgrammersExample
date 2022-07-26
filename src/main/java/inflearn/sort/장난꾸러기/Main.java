package inflearn.sort.장난꾸러기;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 다시 풀기
 * 30분 초과
 */
public class Main {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[2];

        int[] temp = arr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                if (answer[0] == 0) {
                    answer[0] = i + 1;
                } else {
                    answer[1] = i + 1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] answer = T.solution(n, arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.printf(answer[i] + " ");
        }
    }

}
