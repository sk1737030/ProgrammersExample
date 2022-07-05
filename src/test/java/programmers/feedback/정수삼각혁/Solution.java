package programmers.feedback.정수삼각혁;


import java.util.Arrays;
import java.util.Stack;

/**
 * 정수삼각형
 * https://school.programmers.co.kr/courses/11210/lessons/71855
 */
public class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;

        int[] arr = new int[triangle.length];

        dfs(triangle, arr, triangle.length, 0, 0);

        return answer;
    }

    private void dfs(int[][] triangle, int[] arr, int length, int i, int l) {
        if (i == l + 1)
            return;

        if (length == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = triangle[i][l];
        dfs(triangle, arr, length - 1, i + 1, l);
        arr[i] = triangle[i][l + 1];
        dfs(triangle, arr, length, i, l + 1);

    }


}