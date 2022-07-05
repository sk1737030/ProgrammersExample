package inflearn.strings.특정_문자_뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String arg) {
        char[] chars = arg.toCharArray();

        int lt = 0;
        int rt = arg.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }

        }

        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String arg = scanner.nextLine();

        String solution = T.solution(arg);
        System.out.println(solution);
    }

}
