package step2example.stackqueue;

import java.util.Arrays;

/**
 * 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586/solution_groups?language=java
 */
public class StackQueue1Another {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfEnd = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfEnd[day]++;
        }
        return Arrays.stream(dayOfEnd).filter(i -> i != 0).toArray();
    }

    public static void main(String[] args) {
        StackQueue1Another stackQueue1 = new StackQueue1Another();

        //int[] progresses = {93, 30, 55};
        int[] progresses = {95, 90, 99, 99, 80, 99};
        //int[] speeds = {1, 30, 5};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(stackQueue1.solution(progresses, speeds)));
    }
}
