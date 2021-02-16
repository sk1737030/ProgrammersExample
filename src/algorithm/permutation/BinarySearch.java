package algorithm.permutation;

/**
 * 현재의 문제
 * 중복 데이터는 고려안함
 */
public class BinarySearch {
    

    static class Node {
        public Integer data;
        public Node left;
        public Node right;

        private Node() {
        }

        public Node(Integer data) {
            this.data = data;

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

        public BinaryTree() {
        }

        public BinaryTree(Node root) {
            this.root = root;
        }

        public void allSearch() {
            System.out.println(root);
        }

        public void delete(int value) {
            root = deleteRecursive(root, value);
        }

        private Node deleteRecursive(Node current, int value) {
            if (current == null) {
                return null;
            }

            if (value == current.data) {
                // Node to Delete Found
                if (current.left == null && current.right == null) {
                    return null;
                }

                // One Child Case
                if (current.right == null) {
                    return current.left;
                }

                if (current.left == null) {
                    return current.right;
                }

                // two Child Case
                int smallestValue = findSmallestValue(current.left);
                current.data = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
                return current;
            }

            if (value < current.data) {
                current.left = deleteRecursive(current.left, value);
                return current;
            }
            current.right = deleteRecursive(current.right, value);
            return current;
        }

        private int findSmallestValue(Node root) {
            return root.left == null ? root.data : findSmallestValue(root.left);
        }

        private boolean containsNodeRecursive(Node current, int value) {
            if (current == null) {
                return false;
            }
            if (value == current.data) {
                return true;
            }

            return value < current.data ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
        }

        public boolean containsNode(int value) {
            return containsNodeRecursive(root, value);
        }


        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node current, int value) {

            if (current == null) {
                return new Node(value);
            }


            if (value < current.data) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.data) {
                current.right = addRecursive(current.right, value);
            } else {
                return current;
            }

            // current 노드가 Null이면 LeafNode
            return current;
        }

        public int nextSmallestValue(int value) {
            if (!containsNode(value)) {
                return -1;
            }

            Node node = findNode(root, value);

            return nextSmallestValue(node);
        }

        public Node findNode(int value) {
            if (!containsNode(value)) {
                return null;
            }

            return findNode(root, value);
        }

        private Node findNode(Node root, int value) {
            if (root == null) {
                return null;
            }

            if (root.data == value) {
                return root;
            } else if (root.right != null && root.data < value) {
                return findNode(root.right, value);
            } else if (root.left != null && root.data > value) {
                return findNode(root.left, value);
            }

            return null;
        }

        /**
         * node 보다 바로 다음 큰 값을 찾는다.
         *
         * @param node
         * @return
         */
        private int nextSmallestValue(Node node) {
            // 노드의 오른쪽 노드가 존재 할 경우 오른쪽 트리의 최소값이 바로 다음 큰값이된다.
            if (node.right != null) {
                return findSmallestValue(node.right);
            }

            Node parentNode = findParentOfNode(node);

            // 오른쪽 트리가 없는 경우 왼쪽 부트리의 최대값의 X
            while (parentNode != root) {
                if (parentNode.right != null && !parentNode.right.data.equals(node.data) && parentNode.left == null) {
                    return parentNode.right.data;
                } else if (parentNode.right == null || parentNode.left.data.equals(node.data)) {
                    return parentNode.data;
                } else {
                    parentNode = findParentOfNode(parentNode);
                }
            }


            // max 데이터라는뜻
            if (parentNode.right.data.equals(node.data)) {
                return node.data;
            }


            return parentNode.data;
        }

        public Node findParentOfNode(Node node) {
            Node parent = root;
            Node child = root;

            while (true) {
                if (child.data.equals(node.data)) {
                    return parent;
                } else if (child.data < node.data) {
                    parent = child;
                    child = parent.right;
                } else {
                    parent = child;
                    child = parent.left;
                }
            }
        }
    }
}