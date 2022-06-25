package inflearn.greedy.씨름_선수;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();

        List<Main.Person> arr = Arrays.asList(new Main.Person(172, 67),
            new Main.Person(183, 65),
            new Main.Person(180, 70),
            new Main.Person(170, 72),
            new Main.Person(181, 60));

        assertEquals(3, main.solution(arr));
    }

}