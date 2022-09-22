package leetcode.greedy.jump_game;


public class Solution {

    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sum = Math.max(sum, i + nums[i]);
            }

            if (sum >= nums.length - 1) {
                return true;
            }

            if (sum <= i && nums[i] == 0) {
                return false;
            }
        }


        return false;
    }
}
