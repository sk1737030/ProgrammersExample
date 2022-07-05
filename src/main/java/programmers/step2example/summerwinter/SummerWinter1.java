package programmers.step2example.summerwinter;

import java.math.BigInteger;

/**
 * 멀쩡한 사각형
 * https://programmers.co.kr/learn/courses/30/lessons/62048
 */
public class SummerWinter1 {
    public long solution(long w, long h) {
        return w * h - (w + h - gcd(w, h));
    }

    private long gcd(long w, long h) {
        if (w > h) {
            long temp = w;
            w = h;
            h = temp;
        }

        if (w % h == 0) {
            return h;
        } else {
            return gcd(w, h % w);
        }
    }


    public static void main(String[] args) {
        int w = 8;
        int h = 12;
        SummerWinter1 summerWinter1 = new SummerWinter1();
        System.out.println(summerWinter1.solution(w, h)); // 80
    }
}
