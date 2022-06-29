package inflearn.array.큰_수_출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = T.solution(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.printf(result[i] + " ");
        }


    }


}
