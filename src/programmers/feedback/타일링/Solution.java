package programmers.feedback.타일링;

public class Solution {
    int[] arr = new int[60000];

    public int solution(int n) {
        int l = fibonacci(n);
        return l;

    }

    private int fibonacci(int n) {
        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (arr[n] > 0) {
            return arr[n];
        }
        return arr[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1000000007;
    }
}
