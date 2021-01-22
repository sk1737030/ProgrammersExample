package programmers.step2example.stackqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * 프린터
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class StackQueue4 {
    public class Sq {
        public int val;
        public boolean checked;

        public Sq(int val) {
            this.val = val;
            this.checked = false;
        }

        public void print() {
            System.out.println("val = " + val + " checked = " + checked);
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = location;

        Queue<Sq> queue = new LinkedList<>();
        List<Sq> checkedSq = new ArrayList<>();

        List<Integer> maxValues = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        maxValues.sort(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            Sq e = new Sq(priorities[i]);
            if (location == i) {
                e.checked = true;
            }
            queue.add(e);
        }

        int index = 0;
        int maxValue = maxValues.get(index++);

        while (!queue.isEmpty()) {
            Sq poll = queue.poll();
            if (maxValue != poll.val) {
                if (answer == 0) {
                    answer = priorities.length - 1;
                } else {
                    answer--;
                }
                queue.offer(poll);
            } else {

                if (index == priorities.length) {
                    checkedSq.add(poll);
                    break;
                }

                maxValue = maxValues.get(index++);
                checkedSq.add(poll);
            }
        }

        // checkedSq.forEach(Sq::print);

        for (int i = 0; i < checkedSq.size(); i++) {
            if (checkedSq.get(i).checked) {
                return i + 1;
            }
        }

        return priorities.length;
    }

    public static void main(String[] args) {
        StackQueue4 stackQueue4 = new StackQueue4();
        //int[] priorities = {2, 1, 3, 2};
        int[] priorities = {19, 19, 9, 11, 9};
        int location = 0;
        // 3,4,1,2
        System.out.println(stackQueue4.solution(priorities, location));
    }
}
