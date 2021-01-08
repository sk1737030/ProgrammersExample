package stringexample;

/**
 * 다른 사람의 풀이
 * https://programmers.co.kr/learn/courses/30/lessons/12903/solution_groups?language=java
 */
public class String1Another {
    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) {
        String1Another string1Another = new String1Another();
        String word = "abcde";
        System.out.println(string1Another.solution(word));

        System.out.println((word.length() - 1) / 2 + " : " + ((word.length() / 2)+1) );
        System.out.println(3/2);

    }
}
