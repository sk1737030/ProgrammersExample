package monthlycodechallenge;

/**
 * 내적
 * https://programmers.co.kr/learn/courses/30/lessons/70128
 */
public class MCodeChallenge1 {
    public int solution(int[] a, int[] b) {
        int answer = dotProduct(a, b, 0);;

        return answer;
    }

    public int dotProduct(int[] a, int[] b, int index) {
        if (index == a.length - 1) {
            return a[index] * b[index];
        }

        return a[index] * b[index] + dotProduct(a, b, index + 1);
    }

    public static void main(String[] args) {
        MCodeChallenge1 mCodeChallenge1 = new MCodeChallenge1();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int[] c = {-1, 0, 1};
        int[] d = {1, 0, -1};
//        a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.

        mCodeChallenge1.solution(a, b); //3
        mCodeChallenge1.solution(c, d); //-2
    }
}
