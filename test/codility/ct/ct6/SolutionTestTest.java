package codility.ct.ct6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTestTest {
    @Test
    void test() {
        Solution solutions = new Solution();
        assertArrayEquals(new int[]{1}, solutions.solution(1, new int[]{1}));//{2, 3, 1, 5, 4}
        assertArrayEquals(new int[]{2, 3, 1, 5, 4}, solutions.solution(3, new int[]{4, 2, 2, 5, 3}));//{2, 3, 1, 5, 4}
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solutions.solution(1, new int[]{100, 100, 100, 100, 1}));//{2, 3, 1, 5, 4}
        assertArrayEquals(new int[]{2, 1}, solutions.solution(2, new int[]{2, 1}));//{2, 3, 1, 5, 4}
        assertArrayEquals(new int[]{3, 4, 5, 2, 1}, solutions.solution(5, new int[]{3, 4, 5, 2, 1}));
    }


}