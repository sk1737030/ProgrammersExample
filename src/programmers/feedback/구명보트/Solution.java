package programmers.feedback.구명보트;

import java.util.Arrays;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] booleans = new boolean[people.length];

        Arrays.sort(people);

        int length = people.length;
        int heavyPersonIndex = length - 1;
        for (int i = 0; i < length; i++) {
            //아직 안태움
            if (booleans[i]) {
                continue;
            }

            int lightPerson = people[i];
            booleans[i] = true;

            // 무게가 limit보다 크면서, index가 뒤에서오는 인덱스보다 작거나같으면서, 방문하지 아직 태우지 않았으면
            while (i < heavyPersonIndex) {
                if (booleans[heavyPersonIndex] || lightPerson + people[heavyPersonIndex] > limit)
                    heavyPersonIndex--;
                else
                    break;
            }

            booleans[heavyPersonIndex] = true;
            answer += 1;
        }

        return answer;
    }
}