package codility.passingcar;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        int westCount = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 0) {
                answer += westCount;

            } else {
                westCount += 1;

            }
        }

        if (answer > 1000000000 || answer < 0) {
            return -1;
        }

        return answer;
    }
}