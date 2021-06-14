package programmers.step1example.음양_더하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(9, solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        assertEquals(0, solution.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }

}