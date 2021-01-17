
package step1example.stringexample;

/**
 * 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class String10 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] chars = s.toCharArray();
        boolean bool = true;
        for (char aChar : chars) {
            if (aChar != ' ') {
                if (bool) {
                    answer.append(String.valueOf(aChar).toUpperCase());
                    bool = false;
                } else {
                    answer.append(String.valueOf(aChar).toLowerCase());
                    bool = true;
                }
            } else {
                bool = true;
                answer.append(aChar);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String10 string10 = new String10();
        String s = " yy   hello worldasdKK  a";
        System.out.println(string10.solution(s)); // TrY HeLlO WoRlD;
    }
}
