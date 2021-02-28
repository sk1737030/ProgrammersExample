package programmers.feedback.정수삼각형;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void 정수삼각형() {
        Solution solution = new Solution();
        assertEquals(30, solution.solution(new int[][]{
                {7},            // 0
                {3, 8},         // 1
                {8, 1, 0},      // 2
                {2, 7, 4, 4},   // 3
                {4, 5, 2, 6, 5} // 4
                //{4, 5, 2, 6, 5, 1}
        }));
        assertEquals(22, solution.solution(new int[][]{
                {7},
                {3, 8},
                {1, 7, 0}
                //      {2, 7, 4, 4},
                //    {4, 5, 2, 6, 5}
                //{4, 5, 2, 6, 5, 1}
        }));
        /*assertEquals(30, solution.solution(new int[][]{
                {7},
                {9, 4},
                {1, 2, 0},
                {1, 2, 4, 4},
                //{4, 5, 2, 6, 5}
        }));*/
    }
}