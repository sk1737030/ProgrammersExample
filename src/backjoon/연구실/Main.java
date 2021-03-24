package backjoon.연구실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 연구실
 * https://www.acmicpc.net/problem/14502
 */
public class Main {

    int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int maxCnt = 0;

    public int solution(int N, int M, int[][] virusMap) {
        buildWall(virusMap, N, M, 0, 0, 0);
        return maxCnt;
    }

    // 벽면을세운다
    private void buildWall(int[][] virusMap, int n, int m, int iIndex, int jIndex, int cnt) {
        if (cnt == 3) {
            // clone
            int[][] cloneMap = Arrays.stream(virusMap).map(int[]::clone).toArray(int[][]::new);
            // 바이러스 퍼트리기
            spreadVirus(cloneMap, n, m);
            //printed(cloneMap);
            // 안전 개수 구역찾기
            maxCnt = Math.max(maxCnt, findSafeAreaCntByBfs(cloneMap));
            return;
        }

        // 벽세우기
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

    private int findSafeAreaCntByBfs(int[][] spreadVirusMap) {
        int cnt = 0;
        for (int i = 0; i < spreadVirusMap.length; i++) {
            for (int j = 0; j < spreadVirusMap[i].length; j++) {
                if (spreadVirusMap[i][j] == 0) {
                    cnt += findSafeAreaCntByBfs(spreadVirusMap, i, j, spreadVirusMap.length, spreadVirusMap[i].length);
                }
            }
        }
        return cnt;
    }

    private int findSafeAreaCntByBfs(int[][] spreadVirusMap, int i, int j, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        int cnt = 1;
        spreadVirusMap[i][j] = -1;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int[] dir : dirs) {
                int dx = poll[0] + dir[0];
                int dy = poll[1] + dir[1];

                if (dx < n && dy < m && dx >= 0 && dy >= 0 && spreadVirusMap[dx][dy] == 0) {
                    queue.offer(new int[]{dx, dy});
                    spreadVirusMap[dx][dy] = -1;
                    cnt++;
                }
            }
        }

        return cnt;
    }

    // 바이러스 퍼트리기
    private void spreadVirus(int[][] spreadedMap, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (spreadedMap[i][j] == 2) {
                    spreadVirusDFS(spreadedMap, i, j);
                }
            }
        }
    }

    private void spreadVirusDFS(int[][] spreadedMap, int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            for (int[] dir : dirs) {
                int dx = dir[0] + pop[0];
                int dy = dir[1] + pop[1];

                if (dx >= spreadedMap.length || dy >= spreadedMap[i].length || dx < 0 || dy < 0 || spreadedMap[dx][dy] == 1 || spreadedMap[dx][dy] == 2)
                    continue;
                stack.push(new int[]{dx, dy});
                spreadedMap[dx][dy] = 2;
            }
        }
    }

    private void printed(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        System.out.println();
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
