package codility.MaxNonoverlappingSegments;

public class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int answer = 0;

        for (int i = 0; i < B.length - 1; i++) {
            if (B[i] < A[i + 1]) {
                answer++;
            } else {
                B[i + 1] = B[i];
            }
        }

        return B.length == 0 ? 0 : answer + 1;

    }
}
