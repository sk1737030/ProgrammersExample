package codility.GenomicRangeQuery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};

        int[] answer = solution.solution("CAGCCTA", p, q);
        assertArrayEquals(new int[]{2, 4, 1}, answer);
    }

}