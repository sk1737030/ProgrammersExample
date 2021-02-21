package programmers.feedback.게임_맵_최단거리;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void 게임_맵_최단거리_테스트() {
        Solution solution = new Solution();
        assertEquals(11, solution.solution(
                new int[][]{
                        {1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {0, 0, 1, 0, 1}
                }));
    }

}