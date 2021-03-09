package programmers.feedback.입국심사;

import java.util.Arrays;

public class Solution {
    public long solution(int n, int[] times) {
        long start = 1;
        long end = Arrays.stream(times).max().getAsInt() * n;
        long answer = Long.MAX_VALUE;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (isPassed(times, n, mid)) {
                answer = Math.min(answer, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    private boolean isPassed(int[] times, int n, long mid) {
        long count = 0;
        for (int time : times) {
            count += mid / time;
        }
        return count >= n;
    }

}