package leetcode.dp.best_time_to_buy_and_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {

        int answer = 0;

        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];

            if (minPrice > price) {
                minPrice = price;
            } else {
                answer = Math.max(answer, price - minPrice);
            }
        }

        return answer;
    }
}