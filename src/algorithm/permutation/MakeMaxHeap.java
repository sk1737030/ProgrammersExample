package algorithm.permutation;

import java.util.Arrays;

public class MakeMaxHeap {
    private void heapSort(int[] scoville) {
        for (int i = scoville.length; i > 0; i--) {
            exchange(scoville, 0, i - 1);
            maxHeapfiy(scoville, 0, i - 1);
        }
    }

    public void buildMaxHeap(int[] scoville) {
        for (int i = scoville.length / 2; i >= 0; i--) {
            maxHeapfiy(scoville, i, scoville.length);
        }
    }

    // heap으로 만들어준다
    // legnth 를 추가한이유는 heapsort 할 때 힙의 크기를 하나씩 줄이기위해
    private void maxHeapfiy(int[] scoville, int index, int length) {
        // child가 없으면 return
        if (index * 2 + 1 >= length) {
            return;
        }

        int biggestChildIndex = findBiggestChildIndex(scoville, index, length);
        if (scoville[index] >= scoville[biggestChildIndex]) {
            return;
        }

        exchange(scoville, index, biggestChildIndex);
        maxHeapfiy(scoville, biggestChildIndex, length);
    }

    private void exchange(int[] scoville, int origin, int target) {
        int temp = scoville[target];
        scoville[target] = scoville[origin];
        scoville[origin] = temp;
    }

    private int findBiggestChildIndex(int[] scoville, int index, int length) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (index == 0) {
            left = 1;
            right = 2;
        }

        // Tree의 마지막 노드의 오른쪽 노드가 없을 때
        if (right >= length) {
            return left;
        } else {
            return scoville[left] >= scoville[right] ? left : right;
        }
    }

    public static void main(String[] args) {
        MakeMaxHeap makeMaxHeap = new MakeMaxHeap();
        int[] scoville = {1, 5, 13, 16, 7, 8, 11, 14, 0, 2};
        System.out.println(Arrays.toString(scoville));
        makeMaxHeap.buildMaxHeap(scoville);
        System.out.println(Arrays.toString(scoville));
        makeMaxHeap.heapSort(scoville);
        System.out.println(Arrays.toString(scoville));
    }
}
