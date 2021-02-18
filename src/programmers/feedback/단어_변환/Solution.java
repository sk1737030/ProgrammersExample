package programmers.feedback.단어_변환;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        List<String> strings = Arrays.asList(words);

        // target이 주어진 word에 하나라도 없으면
        if (!strings.contains(target))
            return answer;

        Queue<String> queue = new LinkedList<>(strings);
        char[] targetChars = target.toCharArray();

        while (!queue.isEmpty()) {
            String poll = queue.poll();
            char[] beginChars = begin.toCharArray();
            char[] chars = poll.toCharArray();

            // beginString, targetString 이랑 비교해서 단어가 하나만 다르면 return 한다.
            if (getCountDifferentChar(beginChars, targetChars) == 1) {
                return answer + 1;
            }

            // begin과 chars를 비교한다 하나만 차이나면 begin을 넣음
            if (getCountDifferentChar(beginChars, chars) == 1) {
                begin = poll;
                answer++;
            }
        }

        return 0;
    }

    private int getCountDifferentChar(char[] beginChars, char[] chars) {
        return (int) IntStream.range(0, beginChars.length).filter(i -> beginChars[i] != chars[i]).count();
    }
}
