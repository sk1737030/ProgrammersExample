package programmers.feedback.신규_아이디_추천;

import java.util.Locale;

public class Solution {
    public String solution(String new_id) {
        String answer = "";

        new_id = makeToLowerCase(new_id);
        new_id = removeBanCharList(new_id);
        new_id = removeTrimDot(new_id);
        new_id = checkLengthIfZeroFillA(new_id);
        new_id = removeCharsIfOverFifteen(new_id);
        new_id = removeTrimDot(new_id);
        new_id = checkLengthIfUnderTwoFillLastChar(new_id);
        return new_id.trim();
    }

    private String checkLengthIfUnderTwoFillLastChar(String new_id) {
        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }

    private String removeCharsIfOverFifteen(String new_id) {
        StringBuilder sb = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if (!Character.isWhitespace(c) && sb.length() <= 15) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private String checkLengthIfZeroFillA(String new_id) {
        return new_id.length() == 0 ? "a" : new_id;
    }

    private String removeTrimDot(String new_id) {
        char[] chars = new_id.toCharArray();
        char beforeChar = '.';

        // 첫 번 째 마지막 . 제거해야함
        for (int i = 0; i < chars.length; i++) {

            if (beforeChar == '.' && chars[i] == '.') {
                chars[i] = ' ';
            }

            beforeChar = chars[i];
        }

        return new String(chars);
    }

    private String removeBanCharList(String new_id) {
        return new_id.replaceAll("[^a-z0-9.\\-_]", "");
    }

    private String makeToLowerCase(String new_id) {
        return new_id.toLowerCase(Locale.ROOT);
    }
}
