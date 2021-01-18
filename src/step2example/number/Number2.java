package step2example.number;

import java.math.BigDecimal;

/**
 * 피보나치
 */
public class Number2 {
    public int solution(int n) {
        BigDecimal firstValue = BigDecimal.ONE;
        BigDecimal prevValue = BigDecimal.ZERO;
        int j = 0;
        if (n < 3) {
            return 2;
        }

        while (j < n) {
            BigDecimal i = firstValue.add(prevValue);
            prevValue = firstValue;
            firstValue = i;

            j++;
        }
        return Integer.parseInt(String.valueOf(prevValue.remainder(BigDecimal.valueOf(1234567))));
    }
// 1047261

    public int fibonacci(long n) {
        if (n <= 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Number2 number2 = new Number2();
        int n = 1000;
        System.out.println(number2.solution(n)); // 2
    }
}
