package algorithm.permutation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {
    BinarySearch.BinaryTree bt;

    @BeforeEach
    void 초기값() {
        bt = new BinarySearch.BinaryTree();

        bt.add(30);
        bt.add(20);
        bt.add(25);
        bt.add(10);
        bt.add(40);
        bt.add(35);
    }

    @Test
    void 바이너리트리에_값이_포함되어있나() {
        assertTrue(bt.containsNode(30));
        assertTrue(bt.containsNode(20));
        assertTrue(bt.containsNode(25));
        assertFalse(bt.containsNode(11));
    }

    @Test
    void 바이너리트리_삭제() {
        assertTrue(bt.containsNode(30));
        bt.delete(30);
        bt.delete(20);
        assertFalse(bt.containsNode(30));
        assertFalse(bt.containsNode(20));
    }

    @Test
    void 바이너리트리_추가() {
        bt.add(99);
        bt.add(100);
        assertTrue(bt.containsNode(99));
        assertTrue(bt.containsNode(100));
    }

    @Test
    void 바이너리트리_노드찾기() {
        BinarySearch.Node node = bt.findNode(10);
        assertEquals(10, node.data);
    }

    @Test
    void 바이너리트리_두번째최솟값() {
        assertEquals(30, bt.nextSmallestValue(25));
        assertEquals(25, bt.nextSmallestValue(20));
        assertEquals(20, bt.nextSmallestValue(10));
        assertEquals(35, bt.nextSmallestValue(30));
        assertEquals(25, bt.nextSmallestValue(20));
        assertEquals(40, bt.nextSmallestValue(35));
        assertEquals(40, bt.nextSmallestValue(40));
    }
}