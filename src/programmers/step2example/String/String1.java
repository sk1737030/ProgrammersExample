package programmers.step2example.String;

import java.util.Stack;

/**
 * 올바른 괄호
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 */
public class String1 {

    boolean solution(String s) {
        Stack<Character> stack2 = new Stack();

        int index = s.length() - 1;

        while (index >= 0) {
            Character pop = s.charAt(index);

            if (pop.equals(')')) {
                stack2.push(pop);
            } else if (stack2.isEmpty() && pop.equals('(')) {
                return false;
            } else if (pop.equals('(')) {
                stack2.pop();
            }
            index--;
        }

        return stack2.isEmpty();
    }

    public static void main(String[] args) {
        String1 string1 = new String1();
        //String s = ")()("; // false
        //String s = "(())()"; // true
        String s = "((())"; //false
        System.out.println(string1.solution(s));
    }
}
