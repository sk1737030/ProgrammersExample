package step1example.sortexample;

import java.util.Arrays;

/**
 * 다른 사람 풀이
 * https://programmers.co.kr/learn/courses/30/lessons/42748/solution_groups?language=java
 * ARRAYS.COPYOFRANGE 사용
 */
public class Sort1Another {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Sort1 sort1 = new Sort1();
        int[] arrays = {1, 5, 2, 6, 3, 7, 4};
        int[][] commans = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(sort1.solution(arrays, commans)));
    }
}
