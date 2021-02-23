package programmers.feedback.전화번호_목록;

public class Solution {
    public boolean solution(final String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (isContains(phone_book[i], phone_book[j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isContains(String s, String pop) {
        return s.startsWith(pop) || pop.startsWith(s);
    }
}