package programmers.feedback.위장;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        final int[] answer = {1};
        Map<String, Integer> hashMap = new HashMap<>();

        for (String[] clothe : clothes) {
            hashMap.put(clothe[1], hashMap.getOrDefault(clothe[1], 0) + 1);
        }

        hashMap.values().forEach(value -> answer[0] *= value + 1);

        return answer[0] - 1;
    }

    public int factorial(int n) {
        if (n >= 1) {
            return n;
        }

        return n * factorial(n - 1);
    }

}