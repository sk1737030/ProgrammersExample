
package stringexample;

import java.util.Arrays;
import java.util.Locale;

/**
 * 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class String10 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        boolean bool = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                if (bool) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    bool = false;
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                    bool = true;
                }
            } else {
                bool = true;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String10 string10 = new String10();
        String s = " yy   hello worldasdKK  a";
        System.out.println(string10.solution(s)); // TrY HeLlO WoRlD;
    }
}
