package codility.tapeEquilibrium;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] dp = new int[A.length];
        int[] dp2 = new int[A.length];
        int min = Integer.MAX_VALUE;

        dp[0] = A[0];
        dp2[A.length-1] = A[A.length-1];

        for(int i = 1; i < A.length; i++) {
            dp[i] = A[i] + dp[i-1];
        }

        for(int i = A.length - 2; i > 0; i--) {
            dp2[i] = dp2[i + 1] + A[i];
        }

        for(int i = 0; i < A.length - 1 ; i++) {
            min = Math.min(min, Math.abs(dp[i] - dp2[i+1]));
        }

        //System.out.println(Arrays.toString(dp2));

        return min;
    }
}