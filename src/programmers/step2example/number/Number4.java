package programmers.step2example.number;

/**
 * 124 나라의 숫자
 */
public class Number4 {

    public String solution(long n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            long na = n % 3;
            n = n / 3;

            if (na == 0) {
                n = n - 1;
                na = 4;
            }
            System.out.println(n);
            sb.append(na);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Number4 number4 = new Number4();
        System.out.println(number4.solution(60)); // 4
    }
}
