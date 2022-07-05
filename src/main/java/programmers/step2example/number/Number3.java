package programmers.step2example.number;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class Number3 {
    public String solution(int[] numbers) {
        List<String> collect = Arrays.stream(numbers).mapToObj(String::valueOf)
                .sorted((o1, o2) -> new BigInteger(o1 + o2).compareTo(new BigInteger(o2 + o1)) * -1)
                .collect(Collectors.toList());


        return String.valueOf(new BigInteger(String.join("", collect)));
    }

    public static void main(String[] args) {
        Number3 number3 = new Number3();
        //int[] numbers = {6, 10, 2}; // 6210
        //int[] numbers = {3, 30, 34, 5, 9, 0}; // 95343300
        //int[] numbers = {1000, 122, 9, 8, 99};
        //int[] numbers = {0, 0, 0, 0};
        //int[] numbers = {1000, 0, 5, 99, 100};
        //int[] numbers = {0, 5, 10, 15, 20};
        //int[] numbers = {10000, 1000, 10010, 15, 20, 1000, 15, 20, 1000, 15, 20, 1000, 15, 20, 1000};
        //int[] numbers = {3, 5, 9}; // 9534330
        int[] numbers = {40, 403}; // 10, 101

        System.out.println(number3.solution(numbers));

    }
}
