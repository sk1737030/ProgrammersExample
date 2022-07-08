package inflearn.hashmap_treeset.아나그램;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] != bChars[i]) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(T.solution(a, b));
    }

}
