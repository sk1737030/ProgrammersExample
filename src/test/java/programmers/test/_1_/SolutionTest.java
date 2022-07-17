package programmers.test._1_;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();

        assertEquals(5, s.solution(new int[][]{{0, 1, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 1, 1, 1, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 0}},
            new int[][]{{0, 0, 0, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 1, 0, 1}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}}));
    }

}