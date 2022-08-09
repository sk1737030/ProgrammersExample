package inflearn.array.회전_알고리즘;

public class Main {

    public int[] solution(int[] arr, int n) {

        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;

        return arr;
    }

}
