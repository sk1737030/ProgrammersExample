package inflearn.bfs_dfs.중복순열;

public class Main {

    public void solution(int n, int m) {
        int[] pm = new int[m];
        DFS(n, m, 0, pm);
    }

    private void DFS(int n, int m, int i, int[] pm) {
        if (i == m) {
            for (int i1 : pm) {
                System.out.print(i1);
            }
            System.out.println();
        } else {
            for (int j = 1; j <= n; j++) {
                pm[i] = j;
                DFS(n, m, i + 1, pm);
            }
        }

    }
}
