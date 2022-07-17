package programmers.test.groo;

public class Main2 {

    public int solution(int[] sortedNum) {
        int low = 0;
        int high = sortedNum.length;
        int mid;

        if (sortedNum.length < 2) {
            if (sortedNum[0] == 0) {
                return 0;
            }

            return -1;
        }

        while (low <= high) {
            mid = (low + high) / 2;

            int key = sortedNum[mid];

            if (key == mid) {
                return mid;
            } else if (key > mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
