package step1example.filpexample;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68935/solution_groups?language=java
 */
public class Filp1Another {
    public int solution(int n) {
        int answer = 0;
        String third = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(third);
        String reversed = sb.reverse().toString();

        int exp = 0;
        for (int i = reversed.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp);
            exp++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Filp1Another filp1 = new Filp1Another();
        int n1 = 11;
        System.out.println(filp1.solution(n1)); // 19
    }
}
