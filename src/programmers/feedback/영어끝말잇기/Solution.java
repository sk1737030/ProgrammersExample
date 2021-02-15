package programmers.feedback.영어끝말잇기;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answers = {0, 0};

        String prevWord = words[0];
        Set<String> checkedWord = new HashSet<>();
        checkedWord.add(prevWord);

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];

            if (currentWord.charAt(0) != prevWord.charAt(prevWord.length() - 1) || !checkedWord.add(currentWord)) {
                answers[0] = i % n + 1;
                answers[1] = i / n + 1;
                return answers;
            }

            prevWord = currentWord;
        }

        return answers;
    }
}