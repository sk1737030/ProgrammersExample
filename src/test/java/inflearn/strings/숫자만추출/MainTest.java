package inflearn.strings.숫자만추출;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(208, T.solution("g0en2T0s8eSoft"));
    }

}