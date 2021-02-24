package programmers.feedback.게임_맵_최단거리;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int solution(int[][] maps) {
        Map map = new Map();

        int mapsLength = maps.length;

        for (int i = 0; i < mapsLength; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (maps[i][j] == 1) {
                    // 오른쪽 좌표를 확인 후 벽이 아니면 간선 추가
                    if (i + 1 < maps.length && maps[i + 1][j] == 1) {
                        map.addEdge(i, j, i + 1, j);
                    }
                    // 아래 좌표를 확인 후 벽이 아니면 간선 추가
                    if (j + 1 < maps[i].length && maps[i][j + 1] == 1) {
                        map.addEdge(i, j, i, j + 1);
                    }
                }
            }
        }

        return map.getCntOfDestination(0, 0, mapsLength - 1, maps[mapsLength - 1].length - 1);
    }

    static class Map {
        private final Node[][] nodes;

        static class Node {
            private int x;
            private int y;
            private final List<Node> adjacent = new LinkedList<>();
            private boolean visited;

            private Node() {
            }

            public Node(int x, int y) {
                this.x = x;
                this.y = y;
                this.visited = false;
            }

            public void addAdjacent(Node node) {
                adjacent.add(node);
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }

            public List<Node> getAdjacent() {
                return adjacent;
            }

            public void doVisit() {
                visited = true;
            }

            public boolean isVisited() {
                return visited;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "x=" + x +
                        ", y=" + y +
                        ", visited=" + visited +
                        '}';
            }
        }

        public Map() {
            this.nodes = new Node[101][101];
        }

        // 선을 연결하는데 없으면 새로 만든다.
        public void addEdge(int node1X, int node1Y, int node2X, int node2Y) {
            Node node1 = makeNodeIfNull(node1X, node1Y);
            Node node2 = makeNodeIfNull(node2X, node2Y);


            if (!node1.getAdjacent().contains(node2)) {
                node1.addAdjacent(node2);
            }

            if (!node2.getAdjacent().contains(node1)) {
                node2.addAdjacent(node1);
            }
        }

        private Node makeNodeIfNull(int x, int y) {
            Node node = nodes[x][y];

            if (node == null) {
                node = new Node(x, y);
                nodes[x][y] = node;
            }

            return node;
        }


        public int getCntOfDestination(int startX, int startY, int endX, int endY) {
            Queue<Node> queue = new LinkedList<>();
            Queue<Integer> cntQueue = new LinkedList<>(); // 카운터 용 큐
            Node startNode = nodes[startX][startY];

            // 시작 노드 확인
            if (startNode == null)
                return -1;

            queue.offer(startNode);
            cntQueue.offer(1);
            startNode.doVisit();

            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                Integer cnt = cntQueue.poll();


                // 끝나는 지점이면
                if (poll.getX() == endX && poll.getY() == endY) {
                    return cnt;
                }

                for (Node node : poll.getAdjacent()) {
                    if (!node.isVisited()) {
                        cntQueue.offer(cnt + 1);
                        node.doVisit();
                        queue.offer(node);
                    }
                }
            }

            // 못찾았다
            return -1;
        }

    }
}