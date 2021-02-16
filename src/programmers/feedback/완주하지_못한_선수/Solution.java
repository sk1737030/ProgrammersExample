package programmers.feedback.완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String[] answer = new String[1];
        Map<String, Integer> participantMap = new HashMap<>();
        for (String person : participant) {
            participantMap.put(person, participantMap.getOrDefault(person, 0) + 1);
        }

        for (String completePerson : completion) {
            participantMap.put(completePerson, participantMap.getOrDefault(completePerson, 0) - 1);
        }

        participantMap.forEach((person, value) -> {
            if (value > 0)
                answer[0] = person;
        });
        return answer[0];

/*        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];*/
    }
}