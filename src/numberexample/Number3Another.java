package numberexample;

import java.util.Arrays;

public class Number3Another {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Number3Another number3 = new Number3Another();
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(number3.solution(x, n))); // {2,4,6,8,10}
    }
}
