package inflearn.strings.특정_문자_뒤집기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main T = new Main();
        assertEquals("S#T!EG*b@a", T.solution("a#b!GE*T@S"));
        assertEquals("kdd#@kkgj%$#dkgjd@kj$dk", T.solution("kdj#@kdjg%$#kdjgk@kd$dk"));


    }


}