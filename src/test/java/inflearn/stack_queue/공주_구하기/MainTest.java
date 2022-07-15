package inflearn.stack_queue.공주_구하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main t = new Main();
        assertEquals(7, t.solution(8, 3));

        assertEquals(20, t.solution(20, 3));
        assertEquals(494, t.solution(500, 8));
    }

}