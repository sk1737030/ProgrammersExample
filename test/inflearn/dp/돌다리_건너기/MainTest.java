package inflearn.dp.돌다리_건너기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main T = new Main();
        assertEquals(34, T.solution(7));
    }

}