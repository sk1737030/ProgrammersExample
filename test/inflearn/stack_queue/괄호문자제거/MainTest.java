package inflearn.stack_queue.괄호문자제거;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";

        assertEquals("EFLM", T.solution(str));
    }

}