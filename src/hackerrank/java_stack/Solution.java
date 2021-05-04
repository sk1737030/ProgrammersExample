package hackerrank.java_stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            solution.solution(input);
        }

    }

    public void solution(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

        }
    }
}
