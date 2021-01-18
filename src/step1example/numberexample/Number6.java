package step1example.numberexample;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 제일 작은 수 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 */
public class Number6 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        if (arr.length == 1) {
            answer[0] = -1;
            return answer;
        }

        OptionalInt min = Arrays.stream(arr).min();
        answer = Arrays.stream(arr).filter(value -> value != min.getAsInt()).toArray();


        return answer;
    }

    public static void main(String[] args) {
        Number6 number6 = new Number6();

        int[] arr = {4, 3, 2, 1};
        int[] arr2 = {10};
        System.out.println(Arrays.toString(number6.solution(arr))); // 4 , 3, 2
        System.out.println(Arrays.toString(number6.solution(arr2))); // 4 , 3, 2
    }

}
