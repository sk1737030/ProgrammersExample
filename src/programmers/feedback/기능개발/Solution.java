package programmers.feedback.기능개발;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        int prev = -1;

        for (int i = 0; i < progresses.length; i++) {
            int dateOfDevelop = (99 - progresses[i]) / speeds[i];
            if (prev < dateOfDevelop) {
                prev = dateOfDevelop;
            }

            hashMap.put(prev, hashMap.getOrDefault(prev, 0) + 1);
        }

        return hashMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}