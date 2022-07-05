package inflearn.stack_queue.괄호문자제거;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    public String solution(String str) {
        Stack<Character> stack = new Stack<>();

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == ')') {
                while (stack.pop() != '(') {
                }
            } else {
                stack.push(aChar);
            }
        }

//        for (char aChar : chars) {
//            if (aChar == '(') {
//                stack.push(aChar);
//            } else if (aChar == ')') {
//                stack.pop();
//            } else {
//                if (stack.isEmpty()) {
//                    answer += aChar;
//                }
//            }
//        }
//
//        while (!stack.isEmpty()) {
//            answer += stack.pop();
//        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

}
