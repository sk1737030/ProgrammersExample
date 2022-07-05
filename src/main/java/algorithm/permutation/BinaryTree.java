package algorithm.permutation;

/**
 * 이미 정렬을 해놓은 배열을 tree로 변환
 */
public class BinaryTree {
    public static void main(String[] args) {
        int[] ar = new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = i;
        }

        Tree t = new Tree();
        t.makeTree(ar);
        t.searchBTree(t.root, 2);
    }

    static class Tree {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
        }

        Node root;

        public void makeTree(int[] a) {
            root = makeTreeR(a, 0, a.length - 1);
        }

        public void insertNode(int node) {

        }

        private Node makeTreeR(int[] a, int start, int end) {
            if (start > end)
                return null;

            int mid = (start + end) / 2;
            Node node = new Node(a[mid]);
            node.left = makeTreeR(a, start, mid - 1);
            node.right = makeTreeR(a, mid + 1, end);
            return node;
        }

        public void searchBTree(Node n, int find) {
            if (find < n.data) {
                System.out.println("Data is smaller than " + n.data);
                searchBTree(n.left, find);
            } else if (find > n.data) {
                System.out.println("Data is Bigger than " + n.data);
                searchBTree(n.right, find);
            } else {
                System.out.println("Data found");
            }
        }

        public void makeHeapify(int[] tree, int i) {
            // tree의 child가 없다면
            //if(tree[i] )

            // k는 tree의 자식노드들 중에 더 큰 값의 인덱스를 할당
            // int k =

            // 만약에 tree[i] k보다 작다면 heapify 했기 때문에 종료
            // if(tree[i] >= tree[k])
            // return;

            //
            // exchange (tree[i] , tree[k])
            //maxHeapfiy(A,k);
        }
    }
}


