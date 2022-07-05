package inflearn.stack_queue.후위식_연산;

import java.util.Scanner;
import java.util.Stack;

/**
 * 35 Start
 */

public class Main {

    public int solution(String str) {
        Stack<Integer> stack = new Stack();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((int) c);
            } else {
                int a = stack.pop();
                int b = stack.pop();
                int acc = 0;
                if (c == '*') {
                    acc = a * b;
                } else if (c == '+') {
                    acc = a + b;
                } else if (c == '/') {
                    acc = a / b;
                } else {
                    acc = a - b;
                }

                stack.push(acc);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr = T.solution(str);
        System.out.println(arr);
    }


}
