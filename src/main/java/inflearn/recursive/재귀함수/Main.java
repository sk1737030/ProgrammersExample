package inflearn.recursive.재귀함수;

import java.util.Scanner;

public class Main {

    public String solution(int arg) {
        int answer = 0;

        return recursive("", 1, arg + 1);

    }

    private String recursive(String str, int arg, int end) {
        if (arg == end) {
            return str;
        }

        return recursive(str + arg + " ", arg + 1, end);
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(T.solution(i));

    }


}
