package programmers.step1example.numberexample;

/**
 * 두 정수 사이의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class Number1 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            int temp = a;
            b = Math.max(a, b);
            a = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Number1 number1 = new Number1();
        System.out.println(number1.solution(3, 5)); // 12
    }
}
