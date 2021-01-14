package numberexample;

/**
 * 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class Number4 {


    public int solution(int n) {
        int[] excludeArr = new int[n];
        int[] includeArr = new int[n];
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (excludeArr[i - 1] == 0) {
                for (int j = 2; j <= n / 2; j++) {
                    int e = j * i;
                    if (e > n)
                        break;
                    excludeArr[e - 1] = e;
                }
                includeArr[answer++] = i;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Number4 number4 = new Number4();

        //int number = 3000;
        //int number2 = 10;
        int number2 = 1000000;
        // number4.solution(number); // 4
        System.out.println(number4.solution(number2)); // 4
    }
}
