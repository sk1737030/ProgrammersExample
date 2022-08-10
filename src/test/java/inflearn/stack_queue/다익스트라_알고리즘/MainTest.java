package inflearn.stack_queue.다익스트라_알고리즘;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void test() {

        Main T = new Main();
        Main.main(6, 9, new int[][]{
            {1, 2, 12},
            {1, 3, 4},
            {2, 1, 2},
            {2, 3, 5},
            {3, 4, 5},
            {4, 2, 2},
            {4, 5, 5},
            {6, 4, 5}
        });
    }

}