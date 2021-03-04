package programmers.feedback.삼각달팽이;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        int[][] snailArray = new int[n][n];

        int x = -1;
        int y = 0;
        int value = 1;
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                snailArray[++x][y] = value++;
            }
            n--;

            for (int i = 0; i < n; i++) {
                snailArray[x][++y] = value++;
            }
            n--;

            for (int i = 0; i < n; i++) {
                snailArray[--x][--y] = value++;
            }
            n--;
        }


        return Arrays.stream(snailArray)
                .flatMapToInt(ints -> Arrays.stream(ints).filter(inta -> inta > 0))
                .toArray();
    }

}