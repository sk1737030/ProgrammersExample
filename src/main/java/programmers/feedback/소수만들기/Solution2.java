package programmers.feedback.소수만들기;

public class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;

        int numbsLen = nums.length;
        for (int i = 0; i < numbsLen; i++) {
            for (int j = i + 1; j < numbsLen; j++) {
                for (int k = j + 1; k < numbsLen; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
