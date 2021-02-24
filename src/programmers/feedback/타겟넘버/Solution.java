package programmers.feedback.타겟넘버;

public class Solution {
    int total = 0;

    public int solution(int[] numbers, int target) {
        getTotalWithCombination(numbers, new boolean[numbers.length], 0, target);
        return total;
    }

    private void getTotalWithCombination(int[] numbers, boolean[] visited, int depth, int target) {
        int sum = 0;

        for (int i = 0; i < visited.length; i++) {
            // 조합으로 나온녀석은 빼고, 나오지 않은 녀석은 더한다
            if (visited[i]) {
                sum -= numbers[i];
            } else {
                sum += numbers[i];
            }
        }

        if (sum == target) {
            total++;
        }

        for (int i = depth; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                getTotalWithCombination(numbers, visited, i + 1, target);
                visited[i] = false;
            }
        }
    }
}