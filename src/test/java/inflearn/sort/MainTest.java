package inflearn.sort;

import inflearn.sort.중복확인.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals('D', T.solution(new int[]{20, 25, 52, 30, 39, 33, 43, 33}));
    }

}