package programmers.step1example.stringexample;

/**
 * 수박수박수박수박수박수?
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class String4 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                answer.append("수");
            else
                answer.append("박");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String4 string4 = new String4();
        System.out.println(string4.solution(4)); // "수박수박"
        System.out.println(string4.solution(3)); // "수박수"
        System.out.println(string4.solution(5)); // "수박수박수"
    }
}
