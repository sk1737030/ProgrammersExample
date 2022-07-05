package backjoon.islanddfs;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] arr = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 0, 1},
                {1, 0, 1, 0}
        };

        System.out.println(main.solution(arr));
    }

    private int solution(int[][] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                    dfs(arr, i, j);
                }
            }
        }
        return cnt;
    }

    private void dfs(int[][] arr, int i, int j) {
        if (arr == null || arr[0].length == 0) return;

        if (i >= arr.length || i < 0 || j >= arr[i].length || j < 0 || arr[i][j] != 1) return;
        arr[i][j] = -1;
        dfs(arr, i, j + 1);
        dfs(arr, i, j - 1);
        dfs(arr, i + 1, j);
        dfs(arr, i - 1, j);
    }
}
