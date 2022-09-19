package leetcode.array._3sum;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> se = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> num = Arrays.asList(nums[i], nums[left], nums[right]);
                    if (se.add(num)) {
                        answer.add(num);
                    } else {
                        left++;
                    }
                }
            }
        }


        return answer;
    }
}
