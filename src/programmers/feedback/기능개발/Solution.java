package programmers.feedback.기능개발;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        // 첫번째 INDEX 세팅
        list.add((100 - progresses[0]) / speeds[0] + 1);
        int prev = list.get(0);

        for (int i = 1; i < progresses.length; i++) {
            list.add((100 - progresses[i]) / speeds[i] + 1);
            if (prev >= list.get(i)) {
                list.set(i, prev);
            } else {
                prev = list.get(i);
            }
        }

        for (Integer integer : list) {
            hashMap.put(integer, hashMap.getOrDefault(integer, 0) + 1);
        }

        return hashMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}