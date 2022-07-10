package inflearn.stack_queue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

/**
 * 다시풀기
 */

public class Main {

    public int solution(String arg) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        char[] chars = arg.toCharArray();

        char before = 0;

        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            } else {
                stack.pop();

                if (before == ')') {
                    answer++;
                } else {
                    answer += stack.size();
                }
            }

            before = aChar;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();
        int t = T.solution(arg);
        System.out.println(t);
    }


}
