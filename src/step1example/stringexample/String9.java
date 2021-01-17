package step1example.stringexample;

/**
 * 서울에서 김서방 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 */
public class String9 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].length() == 3 && seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String9 string9 = new String9();
        String[] arr = {"Jane", "Kim"};
        System.out.println(string9.solution(arr));
    }
}
