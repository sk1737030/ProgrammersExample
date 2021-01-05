package hashExample;

import java.util.HashMap;

/**
 * 다른 사람들의 풀이
 */
public class Hash1Another {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : participant) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            hm.put(s, hm.getOrDefault(s, 0) - 1);
        }

        for (String s : participant) {
            if (hm.get(s) != 0) {
                return s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] a1 = {"mislav", "stanko", "mislav", "ana", "ana"};
        String[] b = {"eden", "kiki"};
        String[] b1 = {"stanko", "ana", "mislav", "mislav"};
        Hash1Another solution = new Hash1Another();
        System.out.println(solution.solution(a, b));
        System.out.println(solution.solution(a1, b1));
    }
}
