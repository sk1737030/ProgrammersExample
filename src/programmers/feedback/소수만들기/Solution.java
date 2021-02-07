package programmers.feedback.소수만들기;

public class Solution {
    int answer = 0;

    public int solution(int[] nums) {
        boolean[] checked = new boolean[nums.length];
        combination(nums, checked, 0, nums.length, 3);
        return answer;
    }

    private void combination(int[] nums, boolean[] checked, int start, int numsLength, int r) {
        if (r == 0) {
            int num = 0;
            for (int i = 0; i < numsLength; i++) {
                if (checked[i]) {
                    num += nums[i];
                }
            }
            isPrime(num);
            return;
        }

        for (int i = start; i < numsLength; i++) {
            checked[i] = true;
            combination(nums, checked, i + 1, numsLength, r - 1);
            checked[i] = false;
        }
    }

    private void isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return;
            }
        }
        answer++;
    }
}