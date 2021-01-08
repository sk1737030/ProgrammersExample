package consecutiveexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Consecutive1 {
    public int[] solution(int[] arr) {
        int lastValue = -1;
        List<Integer> list = new ArrayList<>();

        for (int j : arr) {
            if (lastValue != j) {
                list.add(j);
            }
            lastValue = j;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Consecutive1 set1 = new Consecutive1();

        int[] array = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(set1.solution(array)));
    }
}
