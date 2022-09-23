package leetcode.array._3sum_closest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(2, solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(2, solution.threeSumClosest(new int[]{-4, -1, 1, 2}, 1));
        assertEquals(-2, solution.threeSumClosest(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2));
        assertEquals(0, solution.threeSumClosest(new int[]{0, 0, 0}, 1));
    }

}