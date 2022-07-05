package backjoon.괄호문제1;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve("(()())(())"));
    }

    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                close++;
            }
            if (open == close) {
                sb.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        return sb.toString();
    }

}
