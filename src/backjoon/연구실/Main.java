package backjoon.연구실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int N, int M, int[][] virusMap) {
        buildWall(virusMap, N, M, 0, 0, 0);

        return -1;
    }

    private void buildWall(int[][] virusMap, int n, int m, int iIndex, int jIndex, int cnt) {

        if (cnt == 3) {

            return;
        }

        for (int i = iIndex; i < n * m; i++) {
            int x = i / m;
            int y = i % m;

            // 벽을 세움
            if (virusMap[x][y] == 0) {
                virusMap[x][y] = 1;
                buildWall(virusMap, n, m, i + 1, jIndex + 1, cnt + 1);
                virusMap[x][y] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Main main = new Main();
        System.out.println(main.solution(N, M, arr));
    }
}
