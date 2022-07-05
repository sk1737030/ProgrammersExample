package programmers.feedback.소수만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<ArrayList<Integer>> subSet = new ArrayList<>(); // 부분집합

    public int solution(int[] nums) {
        int answer = 0;
        boolean[] checked = new boolean[nums.length];

        combination(nums, checked, 0, nums.length, 0);
        answer = getPrimeCnt();

        return answer;
    }

    private int getPrimeCnt() {
        int primeCnt = 0;

        for (ArrayList<Integer> sub : subSet) {
            if (isPrime(sub.stream().mapToInt(Integer::intValue).sum())) {
                primeCnt++;
            }
        }

        return primeCnt;
    }

    private void combination(int[] nums, boolean[] checked, int start, int numsLength, int depth) {
        if (depth == 3) {
            ArrayList<Integer> sub = new ArrayList<>();
            for (int i = 0; i < numsLength; i++) {
                if (checked[i]) {
                    sub.add(nums[i]);
                }
            }
            subSet.add(sub);
            return;
        }

        for (int i = start; i < numsLength; i++) {
            checked[i] = true;
            combination(nums, checked, i + 1, numsLength, depth + 1);
            checked[i] = false;
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}