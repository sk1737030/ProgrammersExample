package codility.fish;

import java.util.Stack;

public class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downFish = new Stack<>();

        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                downFish.push(A[i]);
            } else {
                while (!downFish.isEmpty()) {
                    Integer fish = downFish.pop();
                    if (fish > A[i]) {
                        downFish.push(fish);
                        break;
                    }
                }

                if (downFish.isEmpty()) {
                    answer++;
                }
            }
        }
        return answer + downFish.size();
    }
}
