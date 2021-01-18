package step1example.stringexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 문자내마음대로 정렬하기
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */
public class String7 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Comparator<Object> comparator = Comparator
                .comparing(o -> String.valueOf(o).charAt(n))
                .thenComparing(Object::toString);
        Arrays.stream(strings).sorted(comparator).collect(Collectors.toList()).toArray(answer);


        /*
        Set<Character> set = new TreeSet<>();
        for (String string : strings) {
            set.add(string.charAt(n));
        }
        List<String> arr = new ArrayList<>();
        List<String> collect = Arrays.stream(strings).sorted((o1, o2) -> o1.charAt(n) > o2.charAt(n) ? 0 : -1).collect(Collectors.toList());

        for (Character next : set) {
            List<String> collect1 = collect.stream().filter(s -> s.charAt(n) == next).sorted().collect(Collectors.toList());
            arr.addAll(collect1);
        }
return arr.toArray(answer)  ;
        */

        return answer;
    }

    public static void main(String[] args) {
        String7 string7 = new String7();
        String[] a = {"sun", "bed", "car"};
        String[] b = {"abce", "abca", "abcd"};
        String[] c = {"aax", "agce", "ancq"};
        String[] d = {"cqx", "awce", "awcd"};
        System.out.println(Arrays.toString(string7.solution(a, 1))); // "car", "bed", "sun"
/*
        System.out.println(Arrays.toString(string7.solution(b, 2))); // [abcd, abce, cdx]
        System.out.println(Arrays.toString(string7.solution(c, 1))); // [abcd, abce, cdx]
        System.out.println(Arrays.toString(string7.solution(d, 1))); // [abcd, abce, cdx]
*/
    }

}
