package inflearn.array.회전_알고리즘;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 3, 4, 5}, 5)));
    }

}