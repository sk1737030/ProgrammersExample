package programmers.feedback.도둑질;

import java.util.*;

public class Solution {
    public int solution(int[] money) {
        int[][] dp = new int[2][money.length];

        dp[0][0] = money[0];
        dp[0][1] = money[0];
        dp[0][2] = dp[0][0] + money[2];


        dp[1][1] = money[1];
        dp[1][2] = money[2];

        for (int i = 3; i < money.length; i++) {
            if (i != money.length - 1)
                dp[0][i] = Math.max(dp[0][i - 2] + money[i], dp[0][i - 3] + money[i]);
            dp[1][i] = Math.max(dp[1][i - 2] + money[i], dp[1][i - 3] + money[i]);
        }

        return Math.max(Arrays.stream(dp[0]).max().getAsInt(), Arrays.stream(dp[1]).max().getAsInt());
    }

}
