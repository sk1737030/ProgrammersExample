package codility.바이너리갭;

public class Solution {
    public int solution(final int n) {
        // write your code in Java SE 8
        int answer = 0;

        String binaryStringOfN = Integer.toBinaryString(n);
        char[] chars = binaryStringOfN.toCharArray();
        int cnt = 0;
        for (int i = 1; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '1') {
                answer = Math.max(cnt, answer);
                cnt = -1;
            }
            cnt++;
        }

        return answer;
    }
}

