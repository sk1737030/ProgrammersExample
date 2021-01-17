package step1example.stringexample;

/**
 * 문자열 내 p와 y의 개수
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class String6 {

    boolean solution(String s) {
        int pLength = s.replaceAll("[^pP]", "").length();
        int yLength = s.replaceAll("[^yY]", "").length();

        return pLength == yLength;
    }

    public static void main(String[] args) {
        String6 string6 = new String6();
        String s = "pPPYPPoYYoApyoyY";
        String s2 = "PYyy";
        String s3 = "";
        System.out.println(string6.solution(s));    // 	true
        System.out.println(string6.solution(s2));   //   false
        System.out.println(string6.solution(s3));   // true
    }
}
