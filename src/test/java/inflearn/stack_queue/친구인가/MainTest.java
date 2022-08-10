package inflearn.stack_queue.친구인가;

import org.junit.jupiter.api.Test;
import programmers.test.naver_10.Solution;

class MainTest {

    @Test
    void test() {

        Solution solution = new Solution();
        solution.solution(9, 7, new int[][]{
            {9, 7},
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 5},
            {6, 7},
            {7, 8},
            {8, 9},
            {3, 8}
        });
    }

}