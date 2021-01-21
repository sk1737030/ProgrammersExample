package programmers.step1example.stringexample;

import java.util.Scanner;

/**
 * 직사각형 별찍기
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 */
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
