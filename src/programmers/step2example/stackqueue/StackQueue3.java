package programmers.step2example.stackqueue;

import java.util.Arrays;

/**
 * 주식가격
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 */
public class StackQueue3 {

    public int[] solution(int[] prices) {
        int pricesLength = prices.length;

        int[] answer = new int[pricesLength];

        for (int i = 0; i < pricesLength; i++) {
            int targetPrice = prices[i];
            //System.out.println("targetPrice" + " : " + targetPrice);
            for (int j = i + 1; j < pricesLength; j++) {
                if (targetPrice <= prices[j]) {
                    //System.out.println(prices[j]);
                    answer[i] += 1;
                    continue;
                }

                answer[i] += 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StackQueue3 stackQueue3 = new StackQueue3();
        //int[] prices = {1, 2, 3, 2, 3};  //[4, 3, 1, 1, 0]
        //int[] prices = {0, 1, 2, 3, 1};  //[4, 3, 1, 1, 0]
        //int[] prices = {5, 8, 6, 2, 4, 1}; // [3, 1, 1, 2, 1, 0]
        int[] prices = {1, 2, 3, 2, 3, 1}; // 5, 3, 1, 2, 1, 0

        System.out.println(Arrays.toString(stackQueue3.solution(prices)));
    }
}
