package inflearn.sort.이분검색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(3, T.solution(8, 32, new int[]{23, 87, 65, 12, 57, 32, 99, 81}));
    }

}