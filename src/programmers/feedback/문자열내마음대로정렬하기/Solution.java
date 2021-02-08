package programmers.feedback.문자열내마음대로정렬하기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted((o1, o2) -> {
                    int compare = Character.compare(o1.charAt(n), o2.charAt(n));
                    if (compare == 0) {
                        return o1.compareTo(o2);
                    }
                    return compare;
                }).toArray(String[]::new);
    }


    // 자바는 기본적으로 오름차순으로 정렬한다.
    public String[] solution2(String[] strings, int n) {
        String[] strings1 = Arrays.stream(strings)
                .sorted((o1, o2) -> {
                    // 작은 수는 왼쪽에 그대로있다
                    if (o1.charAt(n) < o2.charAt(n)) {
                        return -1;
                    }
                    // 오른쪽으로간다?
                    if (o1.charAt(n) > o2.charAt(n)) {
                        return 1;
                    }

                    return o1.compareTo(o2);
                }).toArray(String[]::new);
        System.out.println(Arrays.toString(strings1));
        return strings1;
    }

    public static void main(String[] args) {
        Arrays.asList("a", "b").stream().sorted((o1, o2) -> {
            if (o1.charAt(0) < o2.charAt(0)) {
                return -1;
            } else if (o1.charAt(0) > o2.charAt(0)) {
                return 1;
            }
            return 0;
        }).forEach(s -> System.out.println(s));
    }

}
