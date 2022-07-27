package inflearn.bfs_dfs.부분집합_구하기_DFS;

public class Main {

    int[] ch;

    public void solution(int n) {
        ch = new int[n + 1];
        DFS(0, n);
    }

    private void DFS(int i, int n) {

        if (i == n) {
            for (int j = 1; j < ch.length; j++) {
                if (ch[j] == 1) {
                    System.out.print(j);
                }
            }
            System.out.println();
        } else {
            ch[i + 1] = 1;
            DFS(i + 1, n);
            ch[i + 1] = 0;
            DFS(i + 1, n);
        }
    }

}
