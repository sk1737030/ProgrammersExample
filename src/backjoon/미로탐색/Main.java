package backjoon.미로탐색;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int x, int y, int[][] miro) {

        Graph graph = new Graph(x, y);

        for (int i = 0; i < miro.length; i++) {
            for (int j = 0; j < miro[i].length; j++) {
                if (miro[i][j] == 1) {
                    Graph.Node node = graph.nodes[i][j];
                    if (node == null) {
                        node = new Graph.Node(i, j);
                        graph.nodes[i][j] = node;
                    }

                    if (j + 1 < miro[i].length && miro[i][j + 1] == 1) {
                        addNode(graph, node, i, j + 1);
                    }

                    if (i + 1 < miro.length && miro[i + 1][j] == 1) {
                        addNode(graph, node, i + 1, j);
                    }
                }
            }
        }


        return graph.dfs();
    }

    private void addNode(Graph graph, Graph.Node node, int i, int j) {
        Graph.Node adjacent = graph.nodes[i][j];
        if (adjacent == null) {
            adjacent = new Graph.Node(i, j);
            graph.nodes[i][j] = adjacent;
        }
        graph.addEdge(node, adjacent);
    }

    static class Graph {
        Node nodes[][];
        int x;
        int y;

        static class Node {
            int i;
            int j;
            List<Node> adjacent = new LinkedList<>();
            boolean visited;

            public Node(int i, int j) {
                this.i = i;
                this.j = j;
                visited = false;
            }
        }

        public Graph(int x, int y) {
            this.nodes = new Node[x][y];
            this.x = x;
            this.y = y;
        }

        public void addEdge(Node node, Node node2) {
            if (!node.adjacent.contains(node2)) {
                node.adjacent.add(node2);
            }

            if (!node2.adjacent.contains(node)) {
                node2.adjacent.add(node);
            }
        }

        public int dfs() {
            return dfs(nodes[0][0]);
        }

        private int dfs(Node node) {
            Queue<Node> queue = new LinkedList<>();
            Queue<Integer> countOfQueue = new LinkedList<>();
            queue.offer(node);
            countOfQueue.offer(1);
            node.visited = true;

            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                Integer count = countOfQueue.poll();

                if (poll.i == x - 1 && poll.j == y - 1) {
                    return count;
                }

                for (Node node1 : poll.adjacent) {
                    if (!node1.visited) {
                        queue.offer(node1);
                        node1.visited = true;
                        countOfQueue.offer(count + 1);
                    }
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] arr = new int[i][j];

        for (int k = 0; k < i; k++) {
            String str = sc.next();
            for (int l = 0; l < j; l++) {
                arr[k][l] = str.charAt(l) - '0';
            }
        }

        Main main = new Main();
        int solution = main.solution(i, j, arr);
        System.out.println(solution);
    }
}
