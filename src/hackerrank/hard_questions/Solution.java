package hackerrank.hard_questions;


import java.util.Scanner;

public class Solution {

    static int maxScoreOfVincent(int n, String s, String t) {

        char[] vincent = s.toCharArray();
        char[] catherine = t.toCharArray();
        int result = 0;
        for (int i = 0; i < vincent.length; i++) {
            char c = vincent[i];
            if (c != '.' && c != catherine[i]) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the maximum score of Vincent.
        int n = in.nextInt();
        String s = in.next();
        String t = in.next();
        int result = maxScoreOfVincent(n, s, t);
        System.out.println(result);
    }
}