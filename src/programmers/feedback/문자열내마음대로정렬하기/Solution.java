package programmers.feedback.문자열내마음대로정렬하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted((o1, o2) -> {
            int compare = Character.compare(o1.charAt(n), o2.charAt(n));
            if (compare == 0) {
                return o1.compareTo(o2);
            }
            return compare;
        }).toArray(String[]::new);
    }
}
