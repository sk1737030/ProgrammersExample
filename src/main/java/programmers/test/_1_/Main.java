package programmers.test._1_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Main {

    public String solution(String X, String Y) {
        Map<Character, Integer> temp = new HashMap<>();
        Map<Character, Integer> temp2 = new HashMap<>();

        char[] charsX = X.toCharArray();
        char[] charsY = Y.toCharArray();

        for (char x : charsX) {
            temp.put(x, temp.getOrDefault(x, 0) + 1);
        }

        for (char y : charsY) {
            temp2.put(y, temp2.getOrDefault(y, 0) + 1);
        }

        List<Integer> arr = new ArrayList<>();

        temp.forEach((character, integer) -> {

            if (temp2.containsKey(character)) {
                int min = Math.min(temp.get(character), temp2.get(character));
                for (int i = 0; i < min; i++) {
                    arr.add(Integer.parseInt(character + ""));
                }
            }
        });

        if (arr.isEmpty()) {
            return "-1";
        }

        arr.sort(Collections.reverseOrder());

        if (arr.get(0) == 0) {
            return "0";
        }

        return arr.stream().map(String::valueOf).collect(Collectors.joining());
    }
}