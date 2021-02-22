package programmers.feedback.타일링;

public class Solution {
    private final int[] arr = new int[60000];

    public int solution(int n) {
        return tile(n);
    }

    private int tile(int n) {
        /*if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (arr[n] > 0) {
            return arr[n];
        }
        return arr[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1000000007;*/

        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }

        return arr[n];
    }
}
