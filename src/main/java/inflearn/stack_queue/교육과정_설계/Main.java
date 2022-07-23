package inflearn.stack_queue.교육과정_설계;

import java.util.Scanner;

public class Main {

    public String solution(String essentialLecture, String lecture) {

        char[] chars = lecture.toCharArray();
        int cnt = 0;

        for (char ch : chars) {
            if (ch == essentialLecture.charAt(cnt)) {
                cnt++;

                if (cnt == essentialLecture.length()) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String essentialLecture = sc.nextLine();
        String lecture = sc.nextLine();

        String answer = T.solution(essentialLecture, lecture);
        System.out.println(answer);
    }


}
