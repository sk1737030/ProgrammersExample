package inflearn.strings.문자열_압축;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("K2HS7E",T.solution("KKHSSSSSSSE"));
    }

}