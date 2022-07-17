package programmers.test.groo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public int solution(String input) {
        int max = -1;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int length = input.substring(i, input.lastIndexOf(c)).length() - 1;
            max = Math.max(length, max);
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        System.out.println("Hello Goorm! Your input is " + input + input2);
    }

}