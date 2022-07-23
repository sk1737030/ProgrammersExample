package inflearn.array.멘토링;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        T.solution(4, 3,
            new int[][]{
                {3, 4, 1, 2},
                {4, 3, 2, 1},
                {3, 1, 4, 2}});
    }

}