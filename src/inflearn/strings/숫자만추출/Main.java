package inflearn.strings.숫자만추출;

import java.util.Scanner;

public class Main {

    public int solution(String str) {

        char[] chars = str.toCharArray();
        String answer = "";
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                if (ch == '0' && answer.isEmpty()) {
                    continue;
                }

                answer += ch;
            }
        }

        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }


}
