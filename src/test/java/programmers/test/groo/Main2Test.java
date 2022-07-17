package programmers.test.groo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main2Test {

    @Test
    void test() {
        Main2 main2 = new Main2();
        assertEquals(4, main2.solution(new int[]{-100, -50, -25, 0, 4, 10, 100}));
        assertEquals(-1, main2.solution(new int[]{-100, 2, 3, 4, 5}));
        assertEquals(1, main2.solution(new int[]{-100, 1}));
        assertEquals(-1, main2.solution(new int[]{-100, 111}));
        assertEquals(-1, main2.solution(new int[]{-100}));
        assertEquals(0, main2.solution(new int[]{0}));
    }

}