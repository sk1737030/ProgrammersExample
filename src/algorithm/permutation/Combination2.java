package algorithm.permutation;

import java.util.Arrays;

/**
 * 원하는 출력 형태로 출력해보기
 * {1,2,3}  -> 1,12,13,123,2,23,3
 */
public class Combination2 {
    public void doCombination(int[] arr, int[] comArr, boolean[] bool, int n, int depth, int index) {

        //    System.out.println("===> " + Arrays.toString(comArr) + Arrays.toString(bool) + " " + n + "  " + depth);
        if (depth <= n) {
            print(arr, comArr, bool);
        }

        for (int i = index; i < n; i++) {
            if (!bool[i]) {
                bool[i] = true;
                comArr[depth] = arr[i];
                doCombination(arr, comArr, bool, n, depth + 1, i);
                comArr[depth] = -1;
                bool[i] = false;
            }
        }
    }

    private void print(int[] arr, int[] comArr, boolean[] bool) {
        for (int i = 0; i < arr.length; i++) {
            if (comArr[i] > 0)
                //if (comArr[i] > 0)
                System.out.print(comArr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Combination2 combination2 = new Combination2();
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] comArr = new int[n];
        boolean[] bool = new boolean[n];

        int depth = 0;
        //  for (int i = 0; i < n; i++) {
        combination2.doCombination(arr, comArr, bool, n, depth, 0);
        //  bool = new boolean[n];
        //}
    }
}
