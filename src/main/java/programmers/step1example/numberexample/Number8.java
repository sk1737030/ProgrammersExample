package programmers.step1example.numberexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Number8 {
    public int[] solution(long n) {
        List<String> collect = Arrays.stream(String.valueOf(n).split("")).collect(Collectors.toList());
        Collections.reverse(collect);
        return  collect.stream().mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {

        Number8 number8 = new Number8();
        long n = 12345;
        System.out.println(Arrays.toString(number8.solution(n)));
    }
}
