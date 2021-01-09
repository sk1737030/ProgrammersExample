package sortexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 나누어 떨어지는 숫자 배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910/solution_groups?language=java
 */
public class Sort3 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> ans = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                ans.add(j);
            }
        }

        if (ans.isEmpty()) {
            answer = new int[]{-1};
        } else {
            answer = ans.stream().mapToInt(value -> value).sorted().toArray();
        }

        return answer;
    }

    public static void main(String[] args) {
        Sort3 sort3 = new Sort3();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(sort3.solution(arr, divisor))); // 5,10
    }
}
