package leetcode.array._3sum;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> se = new HashSet<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

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
                    // left--;
                    // 바깥쪽 for문에서는 하나하나씩 증가하기때문에 right를 줄이는게 맞다.반대로하면 스킵하는게 생겨버림. 케이스 -1,0,1,2
                } else if (sum < 0) {
                    // right--; For문은 증가하는데 반해 그냥 넘겨 버리는 숫자가 생겨버린다. 하나하나씩 앞에서 증가하는게 아닌경우가 생김
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
