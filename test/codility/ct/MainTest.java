package codility.ct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void tset() {
        Main main = new Main();
        String[] arr = {
                "12:00 ~ 23:59",
                "11:00 ~ 18:00",
                "14:00 ~ 20:00"
        };

        String[] arr2 = {
                "07:00 ~ 11:00",
                "12:00 ~ 13:00"
        };

        //assertEquals("14:00 ~ 18:00", main.solution(arr));
        //assertEquals("-1", main.solution(arr2));
    }

}