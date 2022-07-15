package inflearn.stack_queue.공주_구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 30 분 지남 다시 풀기
 */
public class Main {

    public int solution(int n, int m) {
        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        int answer = 0;

        while (!que.isEmpty()) {
            for (int i = 1; i < m; i++) {
                que.offer(que.poll());
            }

            que.poll();

            if (que.size() == 1) {
                answer = que.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = T.solution(n, m);
        System.out.println(answer);
    }


}
