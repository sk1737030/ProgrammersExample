package inflearn.bfs_dfs.최대점수_구하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main T = new Main();
        assertEquals(41, T.solution(5, 20, new int[][]{
            {10, 5},
            {25, 12},
            {15, 8},
            {6, 3},
            {7, 4}
        }));

        assertEquals(3, T.solution(2, 17, new int[][]{
            {1, 5},
            {2, 12},
        }));
    }

}