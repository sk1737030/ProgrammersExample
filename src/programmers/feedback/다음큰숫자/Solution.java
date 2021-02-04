package programmers.feedback.다음큰숫자;

public class Solution {
    public int solution(final int n) {
        int numberOfOne = getNumberOfOne(n);
        int firstNumBiggerThanN = n + 1;

        while (getNumberOfOne(firstNumBiggerThanN) != numberOfOne) {
            firstNumBiggerThanN++;
        }

        return firstNumBiggerThanN;
    }

    private int getNumberOfOne(int n) {
        int cnt = 0;

        while (n > 0) {
            cnt += n & 1;
            n = n >> 1;
        }

        return cnt;
    }
}
