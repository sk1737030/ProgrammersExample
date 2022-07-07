package inflearn.two_pointers.최대_매출;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals(56, T.solution(new int[]{12, 15, 11, 20, 25, 10, 20, 19, 13, 15}, 3));
        assertEquals(927, T.solution(new int[]{365, 8, 50, 150, 60, 355, 154, 215, 150, 315, 293, 226, 408, 11, 344, 199, 313, 82, 394, 304},
            3));
        assertEquals(126, T.solution(new int[]{100 ,15 ,11 ,20 ,25, 10, 20 ,19 ,13 ,15},3));


    }

}