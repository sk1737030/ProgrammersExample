package leetcode.array._3sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {

        Solution s = new Solution();

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1, -1, 2));
        expected.add(List.of(-1, 0, 1));

        assertEquals(expected, s.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}