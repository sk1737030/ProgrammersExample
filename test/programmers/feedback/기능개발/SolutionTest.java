package programmers.feedback.기능개발;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 1}, solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        assertArrayEquals(new int[]{1, 3, 2}, solution.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{2}, solution.solution(new int[]{95, 92}, new int[]{4, 4}));
    }

}