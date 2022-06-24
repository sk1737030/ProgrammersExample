package inflearn.strings.문자찾기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public int solution(String str, char t) {
        t = Character.toLowerCase(t);
        Map<Character, Integer> maps = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            maps.put(Character.toLowerCase(aChar), maps.getOrDefault(Character.toLowerCase(aChar), 0) + 1);
        }

        return maps.getOrDefault(t, 0);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
