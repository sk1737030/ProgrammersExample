package programmers.feedback.신규_아이디_추천;

import java.util.Locale;

public class Solution {
    public String solution(String new_id) {
        String answer = "";

        new_id = makeToLowerCase(new_id);
        new_id = removeBanCharList(new_id);
        new_id = removeConsecutiveDot(new_id);
        new_id = removeTrimDto(new_id);
        new_id = removeCharsIfOverFifteen(new_id);
        new_id = checkLengthIfZeroFillA(new_id);
        new_id = checkLengthIfUnderTwoFillLastChar(new_id);
        new_id = removeTrimDto(new_id);
        return new_id.trim();
    }

    private String removeTrimDto(String new_id) {

        char[] chars = new_id.toCharArray();

        int index = 0;

        while (true) {
            if (chars[index] == '.') {
                chars[index] = ' ';
            }

            if (chars[index] != '.' && chars[index] != ' ' || index == chars.length - 1) {
                break;
            }
            index++;
        }

        index = chars.length - 1;

        while (true) {
            if (chars[index] == '.') {
                chars[index] = ' ';
            }
            if (chars[index] != '.' && chars[index] != ' ' || 0 == index) {
                break;
            }
            index--;
        }


        return new String(chars);
    }


    private String checkLengthIfUnderTwoFillLastChar(String new_id) {
        StringBuilder new_idBuilder = new StringBuilder(new_id);
        while (new_idBuilder.length() <= 2) {
            new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
        }

        return new_idBuilder.toString();
    }

    private String removeCharsIfOverFifteen(String new_id) {
        StringBuilder sb = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if (!Character.isWhitespace(c) && sb.length() < 15) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String checkLengthIfZeroFillA(String new_id) {
        return new_id.length() == 0 ? "a" : new_id;
    }

    private String removeConsecutiveDot(String new_id) {
        char[] chars = new_id.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == '.' && chars[i] == '.') {
                chars[i - 1] = ' ';
            }
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
