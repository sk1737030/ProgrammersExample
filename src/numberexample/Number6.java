package numberexample;

/**
 * 콜라츠 추측
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Number6 {
    public int solution(long num) {
        int answer = 0;

        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

            answer++;

            if (answer > 500) {
                return -1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Number6 nUmber6 = new Number6();
        int n = 626331;
        System.out.println(nUmber6.solution(n)); // 8
    }
}
