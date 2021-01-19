package step2example.stackqueue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class StackQueue1 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int length = speeds.length;
        int count = 0;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();


        List<Integer> list = Arrays.stream(progresses).boxed().collect(Collectors.toList());

        stack.addAll(list);

        Map<Integer, Integer> hashMap = new TreeMap<>();

        while (!stack.isEmpty()) {
            for (int i = length - 1; i >= 0; i--) {
                if (stack.isEmpty()) {
                    break;
                }
                Integer pop = stack.pop();
                pop += speeds[i];

                tempStack.push(pop);
            }

            count++;

            while (!tempStack.empty()) {
                if (tempStack.peek() >= 100) {
                    tempStack.pop();
                    hashMap.put(count, hashMap.getOrDefault(count, 0) + 1);
                } else {
                    break;
                }
            }

            while (!tempStack.empty()) {
                stack.push(tempStack.pop());
            }
        }

        answer = hashMap.values().stream().mapToInt(Integer::intValue).toArray();


        return answer;
    }

    public static void main(String[] args) {
        StackQueue1 stackQueue1 = new StackQueue1();

        //int[] progresses = {93, 30, 55};
        int[] progresses = {95, 90, 99, 99, 80, 99};
        //int[] speeds = {1, 30, 5};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(stackQueue1.solution(progresses, speeds)));
    }
}
