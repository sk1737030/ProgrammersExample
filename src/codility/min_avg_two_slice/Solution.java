package codility.min_avg_two_slice;

import java.util.Arrays;

class Solution {

    public int solution(int[] A) {

        int answer = 0;

        double[] average = new double[A.length];
        Arrays.fill(average, Integer.MAX_VALUE);
        double temp = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            double tempResult = A[i];

            for (int j = i + 1; j < A.length; j++) {
                tempResult += A[j];
                double j1 = tempResult / (j - i + 1);
                average[i] = Math.min(average[i], j1);

                if (temp > average[i]) {
                    temp = average[i];
                    answer = i;
                }
            }
        }

//        for (int i = 1; i < A.length - 1; i++) {
//            if (temp > average[i]) {
//
//            }
//        }

        return answer;
    }
}
