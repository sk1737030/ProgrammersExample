package numberexample;

import java.util.Arrays;

/**
 * 자릿수 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Number9 {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Number9 number9 = new Number9();
        int n = 123;
        System.out.println(number9.solution(n));// 6
    }
}
