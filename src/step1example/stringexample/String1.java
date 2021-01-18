package step1example.stringexample;

/**
 * 가운데 글자 가져오기
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */

public class String1 {
    public String solution(String s) {
        String answer = "";

        String[] split = s.split("");

        int length = s.length();
        if (length % 2 == 0) {
            answer = split[length / 2 - 1];
            answer += split[length / 2];
        } else {
            answer = split[length / 2];
        }

        return answer;
    }

    public static void main(String[] args) {
        String1 string1 = new String1();

        String s = "abcde";
        System.out.println(string1.solution(s)); // c


    }
}
