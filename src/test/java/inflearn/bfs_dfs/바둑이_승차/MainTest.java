package inflearn.bfs_dfs.바둑이_승차;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(242, T.solution(259, 5, new int[]{81, 58, 42, 33, 61}));
    }

}