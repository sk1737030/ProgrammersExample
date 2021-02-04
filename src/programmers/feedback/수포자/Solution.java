package programmers.feedback.수포자;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(final int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();

        // 수포자들
        final int[][] peoples = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] maxValue = {0};

        for (int i = 0; i < peoples.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == peoples[i][j % peoples[i].length]) {
                    int orDefault = map.getOrDefault(i, 0) + 1;
                    maxValue[0] = Math.max(maxValue[0], orDefault);
                    map.put(i, orDefault);
                }
            }
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxValue[0]))
                .mapToInt(value -> value.getKey() + 1)
                .toArray();
    }
}
