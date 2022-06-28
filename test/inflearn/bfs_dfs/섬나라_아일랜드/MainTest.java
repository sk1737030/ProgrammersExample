package inflearn.bfs_dfs.섬나라_아일랜드;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main2 T = new Main2();
        int[][] board = {
            {1, 1, 0, 0, 0, 1, 0},
            {0, 1, 1, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1, 0, 0}};

        int solution = T.solution(board);
        assertEquals(5, solution);
    }

}