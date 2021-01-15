package numberexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 정수 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Number7 {
    public long solution(long n) {
        return Long.parseLong(Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        Number7 number7 = new Number7();
        int a = 118372;
        System.out.println(number7.solution(a));
    }
}
