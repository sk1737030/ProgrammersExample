package inflearn.strings.유요한_팰린드롬;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        char[] chars = str.toCharArray();

        int j = chars.length - 1;

        for (int i = 0; i < chars.length; i++) {
            if (i > j) {
                break;
            }
            while (!Character.isAlphabetic(chars[i])) {
                i++;
            }
            while (!Character.isAlphabetic(chars[j])) {
                j--;
            }
            if (Character.toUpperCase(chars[i]) != Character.toUpperCase(chars[j--])) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }


}
