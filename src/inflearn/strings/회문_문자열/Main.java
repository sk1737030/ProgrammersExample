package inflearn.strings.회문_문자열;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        int j = str.length() - 1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            if (Character.toUpperCase(chars[i]) != Character.toUpperCase(chars[j--])) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }

}
