package programmers.feedback.도둑질;

import java.util.*;

public class Solution {
    public int solution(int[] money) {

        int[] dp = new int[money.length - 1];
        int[] dp2 = new int[money.length];

        dp[0] = money[0];
        dp[1] = money[0];

        dp2[1] = money[1];
        dp2[2] = 0;

        for (int i = 2; i < money.length - 1; i++) {
            dp[i] = Math.max(money[i] + dp[i - 2], dp[i - 1]);
        }
        for (int i = 2; i < money.length; i++) {
            dp2[i] = Math.max(money[i] + dp2[i - 2], dp2[i - 1]);
        }

        System.out.println(Arrays.toString(dp2));

        return Math.max(dp[money.length - 2], dp2[money.length - 1]);
    }

}
