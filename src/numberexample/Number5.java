package numberexample;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 최대공약수 최소공배수
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */
public class Number5 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);

        return answer;
    }

    private int lcm(int n, int m) {
        int[] vales = new int[n];

        if (n % m == 0) {
            return n;
        }
        int cnt = 0;
        int i = 2;
        while (i <= n) {
            if (n % i == 0 && m % i == 0) {
                n = n / i;
                m = m / i;
                vales[cnt++] = i;
            } else {
                i++;
            }
        }

        if (cnt == 0) {
            vales[0] = 1;
        }


        return Arrays.stream(vales).filter(value -> value > 0).reduce(1, (a, b) -> a * b) * n * m;
    }

    private int gcd(int n, int m) {
        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        if (n % m == 0) {
            return m;
        }

        return gcd(m, n % m);
    }


    public static void main(String[] args) {
        Number5 number5 = new Number5();

        int n = 3;
        int m = 12;
        //System.out.println(Arrays.toString(number5.solution(n, m))); // 3, 12
        int n3 = 28;
        int m3 = 70;
        System.out.println(Arrays.toString(number5.solution(n3, m3))); // 1, 240


    }
}
