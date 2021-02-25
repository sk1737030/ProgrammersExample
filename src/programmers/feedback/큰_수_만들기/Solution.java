package programmers.feedback.큰_수_만들기;

import java.util.Stack;

/**
 * 큰_수만들기
 * https://programmers.co.kr/learn/courses/30/lessons/42883
 */
public class Solution {
    public String solution(String number, int k) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // 77 같은 숫자만 있을 때에는 안지워짐
        while (k-- > 0) {
            stack.pop();
        }

        return stack.toString().replaceAll("[^0-9]", "");
    }
}
