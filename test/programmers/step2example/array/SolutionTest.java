package programmers.step2example.array;

import codility.ct.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 4, 5, 6, 7, 8}, solution.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {5, 6}, {8, 7}}));
    }

}