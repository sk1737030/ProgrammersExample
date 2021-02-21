package programmers.feedback.게임_맵_최단거리;

import java.util.*;

public class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        Map map = new Map(100, 100);

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                map.addNode(i, j);
                map.maxXY(i, j);
            }
        }

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (maps[i][j] == 1) {
                    if (j + 1 < maps[i].length && maps[i][j + 1] == 1) {
                        map.addEdge(map.getNode(i, j), map.getNode(i, j + 1));
                    }

                    if (i - 1 >= 0 && maps[i - 1][j] == 1) {
                        map.addEdge(map.getNode(i, j), map.getNode(i - 1, j));
                    }
                }
            }
        }

        return map.getFastestRoad();

    }


    static class Map {
        private final Node[][] nodes;
        private int index;

        int mX = 0;
        int mY = 0;


        public void maxXY(int x, int y) {
            mX = x;
            mY = y;
        }

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

            public void addAdjacent(Node anotherNode) {
                adjacent.add(anotherNode);
            }

            public boolean containsAdjacent(Node anotherNode) {
                return adjacent.contains(anotherNode);
            }

            public void doVisit() {
                this.visited = true;
            }


            public boolean isVisited() {
                return visited;
            }

            public List<Node> getAdjacent() {
                return adjacent;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
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

        public Map(int xLength, int yLength) {
            this.index = 0;
            nodes = new Node[xLength][yLength];
        }

        public void addNode(int x, int y) {
            Node node = new Node(x, y);
            nodes[x][y] = node;
        }

        public Node getNode(int x, int y) {
            return nodes[x][y];
        }

        public void addEdge(Node node1, Node node2) {
            if (!node1.containsAdjacent(node2)) {
                node1.addAdjacent(node2);
            }

            if (!node2.containsAdjacent(node1)) {
                node2.addAdjacent(node1);
            }
        }

        public int getFastestRoad() {
            return getFastestRoad(0, 0);
        }

        public int getFastestRoad(int x, int y) {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(1);
            Queue<Node> stack = new LinkedList<>();
            Node root = nodes[x][y];
            stack.offer(root);
            root.doVisit();
            while (!stack.isEmpty()) {
                Node pop = stack.poll();
                List<Node> adjacent = pop.getAdjacent();
                Integer poll = queue.poll();

                if (isAnswerNode(pop)) {
                    System.out.println(poll);
                    return poll;
                }

                for (Node node : adjacent) {
                    if (!node.isVisited()) {
                        queue.offer(poll + 1);
                        node.doVisit();
                        stack.offer(getNode(node.getX(), node.getY()));
                    }
                }
            }

            return -1;
        }

        private boolean isAnswerNode(Node node) {
            return node.getX() == mX && node.getY() == mY;
        }


        @Override
        public String toString() {
            return "Map{" +
                    "nodes=" + Arrays.toString(nodes) +
                    ", index=" + index +
                    '}';
        }
    }
}

