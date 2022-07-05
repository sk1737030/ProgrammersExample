package inflearn.strings.가장_짧은_문자거리;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        Integer[] answer = T.solution("teachermode", 'e');
        assertArrayEquals(new Integer[]{1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0}, answer);
    }

}