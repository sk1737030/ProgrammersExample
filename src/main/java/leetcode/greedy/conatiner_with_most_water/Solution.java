package leetcode.greedy.conatiner_with_most_water;

public class Solution {

    public int maxArea(int[] height) {

        int max = 0;

        int leftP = 0;
        int rightP = height.length - 1;

        while (leftP < rightP) {
            int left = height[leftP];
            int right = height[rightP];

            if (height[leftP] > height[rightP]) {
                left = right;
            }

            max = Math.max(max, left * (rightP - leftP));

            if (height[leftP] <= height[rightP]) {
                leftP++;
            } else {
                rightP--;
            }
        }

        return max;
    }
}