package inflearn.stack_queue.조합의_경우수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(10, T.solution(5, 3));
    }


}