package leetcode.longestsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 1;

        int length = s.length();

        if (length == 1) {
            return 1;
        }

        if (length == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap();

        int start = 0;

        for (int i = 0; i < length; i++) {
            char key = s.charAt(i);

            if (map.containsKey(key)) {
                result = Math.max(result, map.size());

                Integer end = map.get(key);

                for (int j = start; j <= end; j++) {
                    map.remove(s.charAt(j));
                }

                start = end + 1;
            }

            map.put(key, i);
        }

        return Math.max(result, map.size());
    }
}
