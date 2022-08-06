package programmers.step2example.완전탐색.피로도;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void tests() {
        Solution s = new Solution();
//        assertEquals(3, s.solution(80, new int[][]{
//            {80, 20},
//            {50, 40},
//            {30, 10}
//        }));
        assertEquals(2, s.solution(80, new int[][]{
            {80, 70},
            {50, 50},
            {30, 10}
        }));
    }

}