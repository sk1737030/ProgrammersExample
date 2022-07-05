package inflearn.two_pointers.두_배열_합치기;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {

        Main T = new Main();
        List<Integer> solution = T.solution(new int[]{1, 3, 5}, new int[]{2, 3, 6, 7, 9});
        String actual = solution.stream().map(integer -> integer + " ").collect(Collectors.joining());

        assertEquals("1 2 3 3 5 6 7 9 ", actual);
    }


}