package codility.Brackets;

import java.util.Stack;

public class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        if (S.length() == 0) {
            return 1;
        }

        Stack<Character> stack = new Stack<>();
        char[] sArr = S.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            char s = sArr[i];

            if (s == '(' || s == '[' || s == '{') {
                stack.push(s);
            } else if (stack.isEmpty() || (s == ')' && stack.peek() != '(')) {
                return 0;
            } else if (stack.isEmpty() || (s == ']' && stack.peek() != '[')) {
                return 0;
            } else if (stack.isEmpty() || (s == '}' && stack.peek() != '{')) {
                return 0;
            } else {
                stack.pop();
            }
        }

        return !stack.isEmpty() ? 0 : 1;
    }
}
