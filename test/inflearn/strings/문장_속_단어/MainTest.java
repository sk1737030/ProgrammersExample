package inflearn.strings.문장_속_단어;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        String answer = main.solution("it is time to study\n");
        assertEquals("study", answer);
        String answer2 = main.solution("dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL");
        assertEquals("LKKJLJLJLKJLLLLLLL", answer2);
        String answer3 = main.solution("eitoiw iruow witouweiotwiowioei eiiuow e");
        assertEquals("witouweiotwiowioei", answer3);
        String answer4 = main.solution("jddgshsgskjkdj dijglolkdwoig dkjkljglkd gksjlkjgls gkjldkjgla");
        assertEquals("jddgshsgskjkdj", answer4);
        String answer5 = main.solution("loveispower");
        assertEquals("loveispower", answer5);

    }

}