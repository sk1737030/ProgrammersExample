package inflearn.stack_queue.교육과정_설계;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("NO", T.solution("AKDEF", "AYKGDHEJ"));
        assertEquals("YES", T.solution("CBA", "CBDAGE"));
    }

}