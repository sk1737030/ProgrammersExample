package programmers.step2example.이진변환반복하기;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() != 1) {
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char aChar : chars) {
                if (aChar == '0') {
                    answer[1]++;
                } else {
                    sb.append("1");
                }
            }
            answer[0]++;
            s = Integer.toBinaryString(sb.length());
        }

        return answer;
    }
}
