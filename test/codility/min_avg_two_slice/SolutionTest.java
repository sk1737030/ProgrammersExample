package codility.min_avg_two_slice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {

        Solution solution = new Solution();

        int[] given = {4, 2, 2, 5, 1, 5, 8};
        int answer = solution.solution(given);

        assertEquals(1, answer);
    }
}