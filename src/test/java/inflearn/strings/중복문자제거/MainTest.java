package inflearn.strings.중복문자제거;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("kset", T.solution("ksekkset"));

    }

}