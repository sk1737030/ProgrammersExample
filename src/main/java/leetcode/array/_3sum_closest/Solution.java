package leetcode.array._3sum_closest;

import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {


            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diff = Math.abs(sum - target); // 두 숫자간의 거리 구하는 방법

                if (diff < min) {
                    min = diff;
                    answer = sum;
                }

                if (sum >= target) {
                    right--; // 3sum 문제와 동일하게 위에서 for문이 순회를 하니 오른쪽에서 줄여야 스킵되는 숫자가 없다.
                } else {
                    left++;
                }
            }
        }


        return answer;
    }
}