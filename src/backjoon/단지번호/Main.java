package backjoon.단지번호;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 단지번호
 * https://www.acmicpc.net/problem/2667
 */
public class Main {
    public int[] solution(final int[][] miro) {

        Graph graph = new Graph(miro.length);

        for (int i = 0; i < miro.length; i++) {
            for (int j = 0; j < miro[i].length; j++) {
                if (miro[i][j] == 1) {
                    Graph.Node node = graph.nodes[i][j];
                    node = makeNodeIfNull(graph, node, i, j);
                    // 다음노드
                    if (j + 1 < miro.length && miro[i][j + 1] == 1) {
                        Graph.Node adjacentNode = graph.nodes[i][j + 1];
                        adjacentNode = makeNodeIfNull(graph, adjacentNode, i, j + 1);
                        graph.addEdge(node, adjacentNode);
                    }

                    // 밑에 노드
                    if (i + 1 < miro.length && miro[i + 1][j] == 1) {
                        Graph.Node adjacentNode = graph.nodes[i + 1][j];
                        adjacentNode = makeNodeIfNull(graph, adjacentNode, i + 1, j);
                        graph.addEdge(node, adjacentNode);
                    }
                }
            }
        }

        graph.dfs();
        return graph.answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private Graph.Node makeNodeIfNull(Graph graph, Graph.Node adjacentNode, int i, int j) {
        if (adjacentNode == null) {
            adjacentNode = new Graph.Node(i, j);
            graph.nodes[i][j] = adjacentNode;
        }
        return adjacentNode;
    }


    static class Graph {
        Node[][] nodes;
        List<Integer> answer = new ArrayList<>();

        static class Node {
            private final int i;
            private final int j;
            private final List<Node> adjacent = new LinkedList<>();
            private boolean visited;

            public Node(int i, int j) {
                this.i = i;
                this.j = j;
                this.visited = false;
            }

            public void addAdjacent(Node node) {
                adjacent.add(node);
            }

            public List<Node> getAdjacent() {
                return adjacent;
            }

            public boolean isVisited() {
                return visited;
            }

            public void doVisits() {
                this.visited = true;
            }
        }

        public Graph(int N) {
            this.nodes = new Node[N][N];
        }

        public void addEdge(Node node1, Node node2) {
            if (!node1.getAdjacent().contains(node2)) {
                node1.addAdjacent(node2);
            }
            if (!node2.getAdjacent().contains(node1)) {
                node2.addAdjacent(node1);
            }
        }

        public void dfs() {
            answer.add(0);
            for (Node[] value : nodes) {
                for (Node node : value) {
                    if (node != null && !node.isVisited()) {
                        answer.set(0, answer.get(0) + 1);
                        answer.add(dfs(node));
                    }
                }
            }
        }

        private int dfs(Node node) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(node);
            node.doVisits();
            int count = 1;
            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                for (Node nodePoll : poll.getAdjacent()) {
                    if (!nodePoll.isVisited()) {
                        nodePoll.doVisits();
                        queue.offer(nodePoll);
                        count++;
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        //전체 사각형 입력 받기
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Main solution = new Main();
        for (int i : solution.solution(arr)) {
            System.out.println(i);
        }

    }
}
