package inflearn.stack_queue.연속_부분수열;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(3, T.solution(8, 6, new int[]{1, 2, 1, 3, 1, 1, 1, 2}));
    }

}