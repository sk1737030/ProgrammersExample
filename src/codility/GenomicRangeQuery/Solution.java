package codility.GenomicRangeQuery;

import java.util.Arrays;
import java.util.Map;

public class Solution {

    private static Map<Character, Integer> map = Map.of('A', 1, 'C', 2, 'G', 3, 'T', 4);

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {

            int p = P[i];
            int q = Q[i];

            int min = 4;

            char[] chars = S.substring(p, q + 1).toCharArray();

            Arrays.sort(chars);
            result[i] = map.get(chars[0]);

//            for (int j = p; j <= q; j++) {
//                char s = S.charAt(j);
//                min = Math.min(min, map.get(s));
//                if (min == 1) {
//                    break;
//                }
//            }

            // result[i] = min;
        }

        return result;
    }
}
