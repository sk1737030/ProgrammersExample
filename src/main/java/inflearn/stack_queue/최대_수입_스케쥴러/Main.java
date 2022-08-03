package inflearn.stack_queue.최대_수입_스케쥴러;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 시간 초과
 * 다시 풀기
 */

public class Main {

    public static class Scheduler implements Comparable<Scheduler> {

        int pay;
        int date;

        public Scheduler(int pay, int date) {
            this.pay = pay;
            this.date = date;
        }

        @Override
        public int compareTo(Scheduler o) {
            return Integer.compare(o.date, this.date);
        }

    }

    public int solution(int max, ArrayList<Scheduler> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < arr.size(); j++) {
                if (arr.get(j).date < i) {
                    break;
                }

                pq.offer(arr.get(j).pay);
            }

            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Scheduler> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Scheduler(m, d));
            if (d > max) {
                max = d;
            }
        }

        int answer = T.solution(max, arr);
        System.out.println(answer);
    }


}
