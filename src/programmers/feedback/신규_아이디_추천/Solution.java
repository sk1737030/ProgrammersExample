package programmers.feedback.신규_아이디_추천;

import java.util.Locale;

public class Solution {
    public String solution(String new_id) {
        Charter charter = new Charter(new_id)
                .makeToLowerCase()
                .removeBanCharList()
                .removeConsecutiveDot()
                .removeTrimDot()
                .removeCharsIfOverFifteen()
                .checkLengthIfZeroFillA()
                .checkLengthIfUnderTwoFillLastChar();
        return charter.Id;
    }

    static class Charter {
        private String Id;

        public Charter(String id) {
            Id = id;
        }

        public Charter removeTrimDot() {
            this.Id = this.Id.replaceAll("^[.]|[.]$", "");
            return this;
        }


        private Charter checkLengthIfUnderTwoFillLastChar() {
            StringBuilder new_idBuilder = new StringBuilder(this.Id);
            while (new_idBuilder.length() <= 2) {
                new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
            }
            this.Id = new_idBuilder.toString();
            this.removeTrimDot();
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
            this.Id = this.Id.replaceAll("[.]{2,}", ".");
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
