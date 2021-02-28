package programmers.feedback.구명보트;

import java.util.Arrays;

public class Solution {
    public int solution(final int[] people, final int limit) {
        int answer = people.length;
        int endIndex = people.length - 1;

        Arrays.sort(people);

        int startIndex = 0;

        while (endIndex > startIndex) {
            // 2명 탔으면
            if (people[startIndex] + people[endIndex--] > limit) {
                startIndex--;
            } else {
                answer--;
            }
//            endIndex--
//            startIndex++;
        }

        return answer;
    }
}