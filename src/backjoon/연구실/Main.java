package backjoon.연구실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 연구실
 * https://www.acmicpc.net/problem/14502
 */
public class Main {
    public int solution(int N, int M, int[][] virusMap) {
        buildWall(virusMap, N, M, 0, 0, 0);

        return -1;
    }


    private void buildWall(int[][] virusMap, int n, int m, int iIndex, int jIndex, int cnt) {

        if (cnt == 3) {
            int[][] spreadVirusMap = spreadVirus(virusMap, n, m);
            //printed(spreadVirusMap);
            
            // TODO:: Graph 생성 간선연결하고 dfs 돌리고 count 가져오기
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

    // 바이러스 퍼트리기
    private int[][] spreadVirus(int[][] virusMap, int n, int m) {
        int[][] spreadedMap = Arrays.stream(virusMap).map(int[]::clone).toArray(int[][]::new);

        // TODO:: 안에 4방향 퍼트리는 부분을 줄여보기 재귀로 줄여볼수있을 듯?
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (spreadedMap[i][j] == 2) {
                    spreadedMap[i][j] = 2;
                    // 4 방향으로 퍼트리기
                    if (j + 1 < m && virusMap[i][j + 1] != 1) {
                        spreadedMap[i][j + 1] = 2;
                    }
                    if (j - 1 >= 0 && virusMap[i][j - 1] != 1) {
                        spreadedMap[i][j - 1] = 2;
                    }
                    if (i + 1 < n && virusMap[i + 1][j] != 1) {
                        spreadedMap[i + 1][j] = 2;
                    }
                    if (i - 1 >= 0 && virusMap[i - 1][j] != 1) {
                        spreadedMap[i - 1][j] = 2;
                    }

                }
            }
        }

        return spreadedMap;
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

    static class Graph {
        Node[][] node;

        static class Node {
            int i;
            int j;
            int data;
            boolean visited;
            List<Node> adjacent = new LinkedList<>();

            public Node(int i, int j, int data) {
                this.i = i;
                this.j = j;
                this.data = data;
                this.visited = false;
            }
        }

        public void addEdge(Node node, Node node2) {
            if (!node.adjacent.contains(node2)) {
                node.adjacent.add(node2);
            }
            if (!node2.adjacent.contains(node)) {
                node2.adjacent.add(node);
            }
        }

        public void dfs() {
            dfs();
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
