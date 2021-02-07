package programmers.feedback.하샤드수;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum != 0 && x % sum == 0;
    }
}
