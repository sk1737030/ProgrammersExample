package codility.frog;

public class Solution {
    public int solution(int X, int Y, int D) {
        int answer = Y - X;
        int solve = answer / D;

        if (answer == 0)
            return answer;

        return answer % D == 0 ? solve : solve + 1;
    }
}