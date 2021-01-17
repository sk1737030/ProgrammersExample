package step1example.sortexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */
public class Sort2 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        IntStream sorted = set.stream().mapToInt(value -> value).sorted();

        answer = sorted.toArray();

        return answer;
    }

    public static void main(String[] args) {
        Sort2 sort2 = new Sort2();
        int[] numbers = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(sort2.solution(numbers))); // 2 ,3 , 4, 5, 6 ,7
    }
}
