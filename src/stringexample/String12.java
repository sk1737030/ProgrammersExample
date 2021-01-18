package stringexample;

/**
 * 문자열을 정수로 바꾸기
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class String12 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String12 string12 = new String12();
        String in = "-1234";
        string12.solution(in);
    }
}
