package stringexample;

import java.util.regex.Pattern;

public class String2 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6)
            return false;

        answer = Pattern.matches("[0-9]*$", s);

        return answer;
    }

    public static void main(String[] args) {
        String2 string2 = new String2();

        String s = "a234";
        String s2 = "1234";
        String s3 = "12345";

        System.out.println(string2.solution(s)); // false
        System.out.println(string2.solution(s2)); // false
        System.out.println(string2.solution(s3)); // false
    }
}
