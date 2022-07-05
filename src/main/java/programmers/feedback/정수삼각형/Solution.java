package programmers.feedback.정수삼각형;

public class Solution {
    public int solution(int[][] triangle) {
        // 탑 다운
        /*for (int i = 1; i < triangle.length; i++) {
            triangle[i][0] = triangle[i - 1][0] + triangle[i][0];
            triangle[i][i] = triangle[i - 1][i - 1] + triangle[i][i];
            for (int j = 1; j < i; j++) {
                triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
            }
        }*/

        // 바텀 업
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Math.max(triangle[i][j] + triangle[i + 1][j], triangle[i][j] + triangle[i + 1][j + 1]);
            }
        }


        return triangle[0][0];
    }
}


