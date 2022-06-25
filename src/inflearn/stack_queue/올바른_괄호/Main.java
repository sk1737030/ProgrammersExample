package inflearn.stack_queue.올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String t) {
        String answer = "NO";

        Stack<Character> str = new Stack<>();

        if (t.isEmpty()) {
            return "NO";
        }

        for (char c : t.toCharArray()) {
            if (c == ')') {
                if (str.isEmpty()) {
                    return answer;
                }

                str.pop();
            } else {
                str.add('(');
            }
        }

        if (!str.isEmpty()) {
            return answer;
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
