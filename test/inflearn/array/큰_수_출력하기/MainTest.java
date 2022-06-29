package inflearn.array.큰_수_출력하기;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();

        int[] arr = {
            7, 3, 9, 5, 6, 12
        };

        int[] solution = T.solution(arr);
        assertArrayEquals(new int[]{7, 9, 6, 12}, solution);
    }

}