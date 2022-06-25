package inflearn.greedy.씨름_선수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();

        int[][] arr = {
            {172, 67},
            {183, 65},
            {180, 70},
            {170, 72},
            {181, 60},
        };

        assertEquals(3, main.solution(arr));
    }

}