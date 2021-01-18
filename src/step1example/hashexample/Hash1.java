package step1example.hashexample;

import java.util.Arrays;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
public class Hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> completions = Arrays.asList(completion);
        completions.sort(String::compareTo);
        List<String> participants = Arrays.asList(participant);
        participants.sort(String::compareTo);

        int size = participants.size();

        for (int i = 0; i < size - 1; i++) {
            if (!participants.get(i).equals(completions.get(i))) {
                return participants.get(i);
            }
        }

        return participants.get(size - 1);
    }

    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] a1 = {"mislav", "stanko", "mislav", "ana", "ana"};
        String[] b = {"eden", "kiki"};
        String[] b1 = {"stanko", "ana", "mislav", "mislav"};
        Hash1 solution = new Hash1();
        System.out.println(solution.solution(a, b));
        System.out.println(solution.solution(a1, b1));
    }
}
