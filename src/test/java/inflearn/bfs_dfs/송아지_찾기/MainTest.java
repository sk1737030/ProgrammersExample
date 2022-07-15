package inflearn.bfs_dfs.송아지_찾기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(3, T.solution(5, 14));
        assertEquals(5, T.solution(8, 3));
    }

}