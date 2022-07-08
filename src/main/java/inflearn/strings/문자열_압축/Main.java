package inflearn.strings.문자열_압축;

import java.util.Scanner;

/**
 * 다시 풀기
 */

public class Main {

    public String solution(String arg) {

        char[] chars = arg.toCharArray();
        int cnt = 1;
        String answer = "";

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];

            if (i + 1 != chars.length && aChar == chars[i + 1]) {
                cnt++;
            } else {
                answer += aChar;

                if (cnt > 1) {
                    answer += cnt;
                }

                cnt = 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();

        String answer = T.solution(arg);
        System.out.println(answer);
    }

}
