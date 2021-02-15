package programmers.feedback.더맵게;

import java.util.Arrays;

public class Solution {
    public int solution(int[] scoville, int K) {

        BinaryTree binaryTree = new BinaryTree();
        for (int i : scoville) {
            binaryTree.treeInsert(i);
        }

        binaryTree.allSearch();

        Node minimal = binaryTree.findMinimum();
        Node successor = binaryTree.successor(binaryTree.treeSearch(minimal.getData()));

        System.out.println(minimal);
        System.out.println(successor);
        Node node = binaryTree.treeSearch(1);
        binaryTree.deleteNode(node);
        binaryTree.allSearch();
        return 0;
    }


    static class Node {
        private Integer data;
        private Node left;
        private Node right;

        private Node() {
        }

        public Node(Integer data) {
            this.data = data;

        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public Integer getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static class BinaryTree {
        private Node root;

        private BinaryTree() {
        }

        public BinaryTree(Node root) {
            this.root = root;
        }

        public void allSearch() {
            System.out.println(root);
        }

        public Node treeSearch(Node node, int data) {
            if (node == null || node.getData() == data) {
                return node;
            }

            if (node.getData() < data) {
                return treeSearch(node.getRight(), data);
            }

            return treeSearch(node.getLeft(), data);

        }

        public Node findMinimum() {
            return findMinimum(root);
        }


        public Node findMinimum(Node node) {
            Node minimumNode = node;

            while (minimumNode.getLeft() != null) {
                minimumNode = minimumNode.getLeft();
            }

            return minimumNode;
        }

        public Node findMax(Node node) {
            Node maxNode = node;
            while (maxNode.getRight() != null) {
                maxNode = maxNode.getRight();
            }

            return maxNode;
        }

        public void deleteNode(Node node) {

            if (node.left == null && node.right == null) {
                Node parentOfNode = findParentOfNode(node);
                if (parentOfNode.left == node) {
                    parentOfNode.left = null;
                } else {
                    parentOfNode.right = null;
                }
            }

            Node parentOfNode = findParentOfNode(node);

            if (node.left == null && node.right != null) { // 자식노드가 하나인경우
                parentOfNode.right = node.right;
            } else if (node.left != null && node.right == null) { // 자식노드가 하나인경우
                parentOfNode.left = node.left;
            } else {// 자식노드가 두개인경우
                Node successor = successor(node);
                node = successor;
                if (successor.left != null && successor.right == null) {
                    parentOfNode.left = successor.left;
                } else if (successor.left == null && successor.right != null) {
                    parentOfNode.right = successor.right;
                }
            }

        }


        public void treeInsert(int data) {
            Node pNode = null;
            Node node = root;

            while (node != null) {
                pNode = node;
                if (node.getData() > data) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }

            Node dataNode = new Node(data);

            if (pNode == null) {
                this.root = dataNode;
            } else if (pNode.getData() < data) {
                pNode.right = dataNode;
            } else {
                pNode.left = dataNode;
            }
        }

        /**
         * node 보다 바로 다음 큰 값을 찾는다.
         *
         * @param node
         * @return
         */
        public Node successor(Node node) {
            // 노드의 오른쪽 노드가 존재 할 경우 오른쪽 부트리의 최소값이 바로 다음 큰값이된다.
            if (node.right != null) {
                return findMinimum(node.getRight());
            }

            Node parentNode = findParentOfNode(node);

            // 오른쪽 트리가 없는 경우 왼쪽 부트리의 최대값의 X
            while (parentNode != root && node.getData().equals(parentNode.getRight().getData())) {
                node = parentNode;
                parentNode = findParentOfNode(parentNode);
            }

            return node;
        }

        public Node treeSearch(int data) {
            return treeSearch(root, data);
        }

        public Node findParentOfNode(Node node) {
            if (root.getData().equals(node.getData())) {
                return root;
            }

            Node parent = root;
            Node child = root;

            while (true) {
                if (parent.getLeft() != null && parent.getLeft().getData() < node.getData()) {
                    parent = child;
                    child = parent.right;
                } else if (parent.getLeft() != null && parent.getLeft().getData() > node.getData()) {
                    parent = child;
                    child = parent.left;
                } else {
                    return parent;
                }
            }
        }
    }
}