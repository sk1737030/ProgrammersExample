package codility.ArrayTask1;

public class Solution {
    public int[] solution(int[] a, int k) {
        // write your code in Java SE 8
        if (a.length == 0) return a;

        for (int i = 0; i < k; i++) {
            a = rotation(a);
        }
        return a;
    }

    private int[] rotation(int[] a) {
        int[] tempA = new int[a.length];
        tempA[0] = a[a.length - 1];
        System.arraycopy(a, 0, tempA, 1, a.length - 1);
        return tempA;
    }
}
