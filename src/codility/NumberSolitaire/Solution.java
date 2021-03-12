package codility.NumberSolitaire;

import java.util.*;

public class Solution {
    public int solution(int[] A) {
        int[] dp = new int[A.length];

        for(int i =0;i<A.length; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        dp[0] = A[0];


        for(int i=0; i < A.length; i++){
            for(int die = 1; die <= 6; die++){
                if(i + die >= A.length) {
                    break;
                }
                dp[i + die] = Math.max(dp[i+die], dp[i] + A[i+die]);
            }
        }

        //System.out.println(Arrays.toString(dp));

        return dp[A.length-1];
    }
}