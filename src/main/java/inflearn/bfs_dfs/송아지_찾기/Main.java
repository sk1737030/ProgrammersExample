package inflearn.bfs_dfs.송아지_찾기;

import java.util.Scanner;

/**
 * BFS로  최단거리 구하기
 * 다시 풀기
 */

public class Main {

    public int solution(int n, int m) {
        int answer = 0;

        int value = m - n;

        if (value < 0) {
            return Math.abs(value);
        }

        answer = value / 5;

        if (value % 5 > 3) {
            answer += 5 - (value % 5) + 1;
        } else {
            answer += value % 5;
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
