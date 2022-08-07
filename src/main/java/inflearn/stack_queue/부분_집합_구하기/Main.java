package inflearn.stack_queue.부분_집합_구하기;

import java.util.Scanner;

public class Main {

    public void solution(int n) {
        int[] temp = new int[4];
        DFS(0, 1, n, temp);
    }

    private void DFS(int l, int i, int n, int[] temp) {
        if (i == n + 1) {
            for (int i1 : temp) {
                if (i1 != 0) {
                    System.out.print(i1);
                }
            }
            System.out.println();
        } else {
            temp[i] = i;
            DFS(l + 1, i + 1, n, temp);
            temp[i] = 0;
            DFS(l, i + 1, n, temp);
        }
    }
}
