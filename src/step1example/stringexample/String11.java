package step1example.stringexample;

/**
 * 시저 암호
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class String11 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            char ch = c;
            if (ch != ' ') {
                int i1 = ch + n;
                if (Character.isUpperCase(ch)) {
                    if (i1 >= 91) {
                        int i = i1 - 91;
                        ch = (char) (65 + i);
                    } else {
                        ch = (char) i1;
                    }
                } else {
                    if (i1 >= 123) {
                        int i = i1 - 123;
                        ch = (char) (97 + i);
                    } else {
                        ch = (char) (i1);
                    }
                }
                answer.append(ch);
            } else {
                answer.append(" ");
            }

        }


        return answer.toString();
    }

    public static void main(String[] args) {
        String11 string11 = new String11();
        String s = "ABC  DZz";
        //String s = "B";
        int n = 25;
        System.out.println(string11.solution(s, n)); //"BC"
    }

}
