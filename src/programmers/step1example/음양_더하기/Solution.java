package programmers.step1example.음양_더하기;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer = signs[i] ? absolutes[i] + answer : absolutes[i] * -1 + answer;
        }

        return answer;
    }
}