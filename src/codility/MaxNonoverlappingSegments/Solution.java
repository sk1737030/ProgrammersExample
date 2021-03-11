package codility.MaxNonoverlappingSegments;

/**
 * https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
 * end 부분을 계속 이어나가면서 풀기
 */
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
