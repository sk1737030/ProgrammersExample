package codility.tapeEquilibrium;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = A.length - 1;

        while (start < A.length - 1) {
            int sum = 0;
            int anotherSum = 0;

            for (int i = 0; i <= start; i++) {
                sum += A[i];
            }

            for (int i = end; i > start; i--) {
                anotherSum += A[i];
            }

            min = Math.min(Math.abs(sum - anotherSum), min);
            start++;
        }

        return min;
    }
}