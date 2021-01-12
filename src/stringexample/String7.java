package stringexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class String7 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

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

        return arr.toArray(answer);
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
