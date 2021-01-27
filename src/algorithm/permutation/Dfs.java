package algorithm.permutation;

import java.util.LinkedList;
import java.util.Stack;

public class Dfs {

    static class Graph {
        Node[] nodes;

        static class Node {
            int i;
            LinkedList<Node> adjacent = new LinkedList<>();
            boolean checked;

            public Node(int i) {
                this.i = i;
                this.checked = false;
            }

            public void addAdjacent(Node aj) {
                adjacent.add(aj);
            }

            public void print() {
                System.out.print(i + " : ");
            }
        }

        public Graph(int size) {
            this.nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];
            if (!n1.adjacent.contains(n2))
                n1.addAdjacent(n2);
            if (!n2.adjacent.contains(n1))
                n2.addAdjacent(n1);
        }

        void dfs() {
            dfs(0);
        }

        void dfs(int index) {
            Node root = nodes[index];
            Stack<Node> nodeStack = new Stack<>();
            nodeStack.push(root);
            while (!nodeStack.isEmpty()) {
                Node pop = nodeStack.pop();
                for (Node node : pop.adjacent) {
                    if (!node.checked) {
                        node.checked = true;
                        nodeStack.push(node);
                    }
                }
                pop.print();
            }
        }
    }


    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 8);
        graph.addEdge(6, 9);
        graph.dfs();
    }
}
