package programmers.step1example.numberexample;

/**
 * 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class Number7 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Number7 number7 = new Number7();

        int n = 12;
        System.out.println(number7.solution(n));
    }

}
