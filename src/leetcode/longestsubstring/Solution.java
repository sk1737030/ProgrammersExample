package leetcode.longestsubstring;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = s.length() - 1;

        if (s.isEmpty()) {
            return 0;
        }

        for (int i = result; i > 0; i--) {
            int j = 0;

            do {
                String substring = s.substring(j, i + j + 1);

                boolean duple = false;
                for (int i1 = 0; i1 < substring.length(); i1++) {
                    if (substring.indexOf(substring.charAt(i1)) != i1) {
                        duple = true;
                        break;
                    }
                }

                if (!duple) {
                    return substring.length();
                }

                j++;

            } while (i + j != s.length());
        }

        return 1;
    }
}
