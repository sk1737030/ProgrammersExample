package programmers.feedback.신규_아이디_추천;

import java.util.Locale;

public class Solution {
    public String solution(String new_id) {
        String answer = "";
        Charter charter = new Charter(new_id)
                .makeToLowerCase()
                .removeBanCharList()
                .removeConsecutiveDot()
                .removeTrimDto()
                .removeCharsIfOverFifteen()
                .checkLengthIfZeroFillA()
                .checkLengthIfUnderTwoFillLastChar()
                .removeTrimDto();

        return charter.Id.trim();


        /*new_id = makeToLowerCase(new_id);
        new_id = removeBanCharList(new_id);
        new_id = removeConsecutiveDot(new_id);
        new_id = removeTrimDto(new_id);
        new_id = removeCharsIfOverFifteen(new_id);
        new_id = checkLengthIfZeroFillA(new_id);
        new_id = checkLengthIfUnderTwoFillLastChar(new_id);
        new_id = removeTrimDto(new_id);*/
    }

    static class Charter {
        private String Id;

        public Charter(String id) {
            Id = id;
        }

        public Charter removeTrimDto() {
            char[] chars = this.Id.toCharArray();
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

            this.Id = new String(chars);
            return this;
        }


        private Charter checkLengthIfUnderTwoFillLastChar() {
            StringBuilder new_idBuilder = new StringBuilder(this.Id);
            while (new_idBuilder.length() <= 2) {
                new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
            }
            this.Id = new_idBuilder.toString();
            return this;
        }

        private Charter removeCharsIfOverFifteen() {
            StringBuilder sb = new StringBuilder();
            for (char c : this.Id.toCharArray()) {
                if (!Character.isWhitespace(c) && sb.length() < 15) {
                    sb.append(c);
                }
            }
            this.Id = sb.toString();
            return this;
        }

        private Charter checkLengthIfZeroFillA() {
            this.Id = this.Id.length() == 0 ? "a" : this.Id;
            return this;
        }

        private Charter removeConsecutiveDot() {
            char[] chars = this.Id.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                if (chars[i - 1] == '.' && chars[i] == '.') {
                    chars[i - 1] = ' ';
                }
            }
            this.Id = new String(chars);
            return this;
        }

        private Charter removeBanCharList() {
            this.Id = this.Id.replaceAll("[^a-z0-9.\\-_]", "");
            return this;
        }

        private Charter makeToLowerCase() {
            this.Id = this.Id.toLowerCase(Locale.ROOT);
            return this;
        }

    }


}
