package codility.FrogRiverOne;

public class Solution {
    public int solution(int X, int[] A) {
        int[] arr = new int[X+1];
        int count = 0;
        for(int i = 0; i < A.length; i++) {

            if(arr[A[i]] == 0) {
                count++;
            }
            arr[A[i]] = A[i];

            if(count == X) {
                return i;
            }

        }

        return -1;
    }
}