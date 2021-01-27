package algorithm.permutation;

import java.util.Arrays;

/**
 * 조합
 * 중복없는
 */
public class Combination {

    public static void main(String[] args) {
        Combination combination = new Combination();
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int r = 2;
        int[] comArr = new int[n];
        combination.doCombination(arr, n, r, 0, 0, comArr);
    }

    private void doCombination(int[] arr, int n, int r, int index, int target, int[] comArr) {
        //System.out.println(" === > " + n + " : " + r + " : " + index + " : " + target);
        if (r == 0) {
            System.out.println(Arrays.toString(comArr));

        } else if (target == n) {
            return;
        } else {
            comArr[index] = target;
            doCombination(arr, n, r - 1, index + 1, target + 1, comArr);
            doCombination(arr, n, r, index, target + 1, comArr);
        }
    }
}
