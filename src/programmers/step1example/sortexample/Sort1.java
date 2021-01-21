package programmers.step1example.sortexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * K번 째 수
 */

public class Sort1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> arr = new ArrayList<>();

        int firstPickForSlice;
        int lastPickForSlice;
        int pickForReturn;

        for (int i = 0; i < commands.length; i++) {
            firstPickForSlice = commands[i][0] - 1;
            lastPickForSlice = commands[i][1];
            pickForReturn = commands[i][2];

            for (int j = firstPickForSlice; j < lastPickForSlice; j++) {
                arr.add(array[j]);
            }

            arr.sort(Integer::compareTo);

            answer[i] = arr.get(pickForReturn - 1);
            arr.clear();
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
