package programmers.step1example.stringexample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문자열 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class String8 {
    public String solution(String s) {
        List<String> collect = Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return String.join("", collect);
    }


    public static void main(String[] args) {
        String8 string8 = new String8();
        System.out.println(string8.solution("Zbcdefg")); // gfedcbZ
        System.out.println(string8.solution("ZbBcdefg")); // gfedcbZ
    }
}
