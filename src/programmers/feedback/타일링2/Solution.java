package programmers.feedback.타일링2;

public class Solution {
    public long solution(final int n) {
        final long[] arr = new long[n + 1];
        arr[0] = 1;
        arr[2] = 3;
        
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 2] * 3;

            for (int j = i - 4; j >= 0; j -= 2) {
                arr[i] = (arr[i] + arr[j] * 2) % 1000000007;
            }
        }

        return arr[n];
    }
}