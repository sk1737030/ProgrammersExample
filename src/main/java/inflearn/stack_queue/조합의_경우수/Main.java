package inflearn.stack_queue.조합의_경우수;

import java.util.Scanner;

public class Main {

    int answer = 0;

    public int solution(int n, int m) {
        DFS(n, m, 0, 0);
        return answer;
    }


    private void DFS(int n, int m, int i, int j) {
        if (j == m) {
            answer++;
        } else {
            for (int l = i; l < n; l++) {
                DFS(n, m, l + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Main T = new Main();
        int answer = T.solution(5, 3);
        System.out.println(answer);
    }
}
