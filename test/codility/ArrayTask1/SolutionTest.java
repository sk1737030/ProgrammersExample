package codility.ArrayTask1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void 어레이테스크1() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{}, solution.solution(new int[]{}, 1));
    }


}