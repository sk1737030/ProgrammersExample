package programmers.step1example.numberexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * x만큼 간격이 있는 n개의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Number3 {
    public long[] solution(int x, int n) {
        List<Long> arrayList = new ArrayList<>(n);

        System.out.println(n);

/*

        long count = 0L;

        for (int i = 0; i < n; i++) {
            count += x;
            arrayList.add(count);
        }

*/
        return arrayList.stream().mapToLong(Long::longValue).toArray();
    }

    public static void main(String[] args) {
        Number3 number3 = new Number3();

        int x = 2;
        int n = 5;

        System.out.println(Arrays.toString(number3.solution(x, n))); // {2,4,6,8,10}
    }
}
