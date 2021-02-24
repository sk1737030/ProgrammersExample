package programmers.feedback.타일링2;

public class Solution {
    public static final int MOD = 1000000007;

    public long solution(final int n) {
        final long[] arr = new long[n + 1];
        arr[0] = 1;
        arr[2] = 3;

        long sum = 0;
        for (int i = 4; i <= n; i += 2) {
            sum += arr[i - 4] * 2;
            arr[i] = (sum + arr[i - 2] * 3) % MOD;

        }
        return arr[n];
    }
}