package leetcode.greedy.jump_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
        assertTrue(solution.canJump(new int[]{3, 0, 8, 2, 0, 0, 1}));
        assertTrue(solution.canJump(new int[]{2, 0}));
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

}