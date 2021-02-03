package programmers.feedback.다음큰숫자;

public class Solution {
    public int solution(final int n) {
        int numberOfOne = getNumberOfOne(n);

        for (int i = n + 1; i <= 1000000; i++) {
            if (getNumberOfOne(i) == numberOfOne) {
                return i;
            }
        }

        return n;
    }

    public int getNumberOfOne(final int n) {
        int binaryOfN = Integer.parseInt(Integer.toBinaryString(n));
        int cnt = 0;

        while (binaryOfN > 0) {
            if (binaryOfN % 10 == 1) {
                cnt++;
            }
            binaryOfN /= 10;
        }

        return cnt;
    }
}
