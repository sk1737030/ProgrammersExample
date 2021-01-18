package step1example.numberexample;

/**
 * 정수 제곱근 판별
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 */
public class Number10 {
    public long solution(long n) {

        double sqrtN = Math.sqrt(n);

        if (sqrtN % 1 == 0) {
            return (long) Math.pow(sqrtN + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {
        Number10 number10 = new Number10();
        long n = 121;
        System.out.println(number10.solution(n)); // 144
    }
}
