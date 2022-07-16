package inflearn.hashmap_treeset.학급회장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public String solution(String arg) {
        char[] chars = arg.toCharArray();
        int Max = Integer.MIN_VALUE;
        char answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
            Integer integer = map.get(aChar);
            map.get(aChar);
            if (Max < integer) {
                answer = aChar;
                Max = integer;
            }
        }

        return answer + "";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(T.solution(sc.next()));
    }
}
