package inflearn.array.보이는_학생;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        int answer = T.solution(new int[]{130, 135, 148, 140, 145, 150, 150, 153});
        assertEquals(5, answer);
    }


}