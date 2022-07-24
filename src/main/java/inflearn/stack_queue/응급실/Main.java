package inflearn.stack_queue.응급실;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * 16:16 시간초과
 */

public class Main {

    public static class Student {

        int id;
        int priority;

        public Student(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr) {

        Queue<Student> q = new LinkedList<>();
        PriorityQueue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            q.offer(new Student(i, arr[i]));
            pr.offer(arr[i]);
        }

        int answer = 0;
        int priority = arr[m];

        while (!q.isEmpty()) {
            Student poll = q.poll();

            if (poll.priority == pr.peek()) {
                pr.poll();
                answer++;

                if (poll.priority == priority && poll.id == m) {
                    return answer;
                }
            } else {
                q.offer(poll);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }


}
