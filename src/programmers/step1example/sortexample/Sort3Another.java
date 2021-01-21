package programmers.step1example.sortexample;

import java.util.Arrays;

public class Sort3Another {
    public int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
    }

    public static void main(String[] args) {
        Sort3Another sort3 = new Sort3Another();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(sort3.solution(arr, divisor))); // 5,10
    }
}
