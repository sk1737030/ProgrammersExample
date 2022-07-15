package inflearn.bfs_dfs.송아지_찾기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BFS로
 * 최단거리 구하기 다시 풀기
 */

public class Main {

    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int solution(int n, int m) {
        return BFS(n, m);
    }

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if (x == e) {
                    return L;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }

            L++;
        }

        return L;
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
