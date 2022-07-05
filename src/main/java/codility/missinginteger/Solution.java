package codility.missinginteger;

public class Solution {

    public int solution(int[] A) {
        // 2,3,4,5  5
        boolean[] a = new boolean[A.length + 1];

        for (int i1 : A) {
            if (i1 > 0 && i1 < a.length) {
                a[i1] = true;
            }
        }

        for (int i = 1; i < a.length; i++) {
            if (!a[i]) {
                return i;
            }
        }

        return A.length + 1;
    }
}
