package codility.pqr;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if ((long) A[i] + A[i + 1] > A[i + 2] && (long) A[i + 1] + A[i + 2] > A[i] && (long) A[i + 2] + A[i] > A[i + 1]) {
                return 1;
            }
        }

        return 0;
    }
}