package inflearn.bfs_dfs.동전교환;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(3, T.solution(3, 15, new Integer[]{1, 2, 5}));
    }

}