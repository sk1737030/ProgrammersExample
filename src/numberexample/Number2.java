package numberexample;

import java.util.Arrays;

public class Number2 {
    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    public static void main(String[] args) {
        Number2 number2 = new Number2();

        int[] arr = {1, 2, 3, 4};

        System.out.println(number2.solution(arr)); // 2.5
    }
}
