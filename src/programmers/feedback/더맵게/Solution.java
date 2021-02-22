package programmers.feedback.더맵게;

import java.util.PriorityQueue;

public class Solution {
    public int solution(final int[] scoville, final int K) {
        int cnt = 0;
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();

        for (int sc : scoville) {
            scovilleQueue.offer(sc);
        }
        int smallest = -1;
        while (!scovilleQueue.isEmpty()) {
            smallest = scovilleQueue.poll();
            if (scovilleQueue.isEmpty() && smallest < K) {
                return -1;
            }
            if (smallest > K) {
                return cnt;
            }
            scovilleQueue.offer(smallest + (scovilleQueue.poll() * 2));
            cnt++;
        }

        return cnt;
    }
}