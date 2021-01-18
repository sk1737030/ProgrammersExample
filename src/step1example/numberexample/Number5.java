package step1example.numberexample;

import java.util.Arrays;

/**
 * 행렬의 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 */
public class Number5 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int i1 = arr1[i][j];
                int i2 = arr2[i][j];
                answer[i][j] = i1 + i2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Number5 number5 = new Number5();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        System.out.println(Arrays.deepToString(number5.solution(arr1, arr2))); // {4,6},{7,9}
    }
}
