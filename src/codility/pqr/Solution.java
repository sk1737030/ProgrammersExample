package codility.pqr;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if ((long) A[i] + A[j] > A[k] && (long) A[j] + A[k] > A[i] && (long) A[k] + A[i] > A[j]) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
