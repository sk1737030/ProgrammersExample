package inflearn.bfs_dfs.합이_같은_부분집합;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main t = new Main();
        assertEquals("YES", t.solution(6, new int[]{1, 3, 5, 6, 7, 10}));
    }
}