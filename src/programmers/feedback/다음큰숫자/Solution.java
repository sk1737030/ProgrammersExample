package programmers.feedback.다음큰숫자;

public class Solution {
    public int solution(int n) {
        int numberOfOne = getNumberOfOne(n);

        for (int i = n + 1; i <= 1000000; i++) {
            int cnt = getNumberOfOne(i);
            if (cnt == numberOfOne) {
                return i;
            }
        }

        return n;
    }

    public int getNumberOfOne(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));

        int length = sb.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            char c = sb.charAt(i);
            if (c == '1')
                cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(15)); //23

        // 1001110
    }
}
