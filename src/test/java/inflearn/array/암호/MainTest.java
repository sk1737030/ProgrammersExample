package inflearn.array.암호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main T = new Main();
        assertEquals("COOL", T.solution(4, "#****###**#####**#####**##**"));

    }

}