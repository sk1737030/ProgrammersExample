package programmers.test._1_;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main2Test {

    @Test
    void test() {

        Main2 s = new Main2();
        assertEquals(3,
            s.solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple",
                    "banana"}));

        assertEquals(0,
            s.solution(new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));


    }

}