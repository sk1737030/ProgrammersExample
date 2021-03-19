package programmers.feedback.네트워크;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int solution(int n, int[][] computers) {
        Graph graph = new Graph(n);

        // 선 연결
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (i != j && computers[i][j] == 1) {
                    graph.addEdge(i, j);
                }
            }
        }

        return graph.dfs();
    }

    static class Graph {
        Network[] networks;

        static class Network {
            int nId;
            private final LinkedList<Network> adjacent = new LinkedList<>();
            private boolean visit = false;

            private Network() {
            }

            public Network(int network) {
                this.nId = network;
            }

            public void addAdjacent(Network network) {
                adjacent.add(network);
            }

            public boolean canVisit() {
                return visit;
            }

            public void doVisit() {
                visit = true;
            }

            public boolean contains(Network network) {
                return adjacent.contains(network);
            }

            public List<Network> getAllAdjacentNetwork() {
                return adjacent;
            }
        }

        public Graph(int size) {
            this.networks = new Network[size];
            for (int i = 0; i < size; i++) {
                networks[i] = new Network(i);
            }
        }


        // 선연결
        public void addEdge(int nId, int nId2) {
            Network network1 = networks[nId];
            Network network2 = networks[nId2];
            if (!network1.contains(network2)) {
                network1.addAdjacent(network2);
            }
        }

        public int dfs() {
            int count = 0;

            // 계속 돌면서 네트워크가 한번씩은 방문했는지 확인한다.
            for (int i = 0; i < networks.length; i++) {
                Network network = networks[i];
                if (!network.canVisit()) {
                    dfs(i);
                    count++; // 방문을 안한 네트워크가 있으면 +1;
                }
            }

            return count;
        }


        public void dfs(int index) {
            Stack<Network> stack = new Stack();
            stack.push(networks[index]);

            while (!stack.isEmpty()) {
                Network pop = stack.pop();
                List<Network> allAdjacentNetwork = pop.getAllAdjacentNetwork();

                // 인접 노드 방문
                for (Network adjacentNetwork : allAdjacentNetwork) {
                    // 아직 방문을 안했으며 && 상대방 네트워크와 이어져있으면
                    if (!adjacentNetwork.canVisit() && adjacentNetwork.contains(pop)) {
                        adjacentNetwork.doVisit();
                        stack.push(adjacentNetwork);
                    }
                }
            }
        }
    }
}