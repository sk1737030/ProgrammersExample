package step1example.stringexample;

/**
 * 핸드폰 번호 가리기
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 */

public class String3 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        answer.append("*".repeat(phone_number.length() - 4));
        answer.append(phone_number.substring(phone_number.length() - 4));


        return answer.toString();
    }

    public static void main(String[] args) {
        String3 string3 = new String3();
        String phone_number = "01033334444";
        System.out.println(string3.solution(phone_number)); // *******4444
    }
}
