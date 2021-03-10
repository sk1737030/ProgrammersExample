package codility.maxcounter;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[N];
        int max = 0;
        int lastMaxN = 0;

        for (int a : A) {
            if (a == N + 1) {
                lastMaxN = max;
                //        System.out.println(lastMaxN);
            } else {
                if (arr[a - 1] + 1 <= lastMaxN) {
                    arr[a - 1] = lastMaxN;
                }
                //        System.out.println("arr[a - 1] : " + arr[a - 1]);
                //       System.out.println(Arrays.toString(arr));

                arr[a - 1] += 1;
                max = Math.max(arr[a - 1], max);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lastMaxN) {
                arr[i] = lastMaxN;
            }
        }
        return arr;
    }
}