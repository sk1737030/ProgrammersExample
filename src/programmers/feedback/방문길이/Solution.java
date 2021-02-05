package programmers.feedback.방문길이;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    Set<String> set = new HashSet<>();

    private int x = 0;
    private int y = 0;
    private int answer = 0;

    public int solution(String dirs) {
        String[] split = dirs.split("");

        for (String dir : split) {
            switch (dir) {
                case "L":
                    move(x - 1, y);
                    break;
                case "R":
                    move(x + 1, y);
                    break;
                case "U":
                    move(x, y + 1);
                    break;
                case "D":
                    move(x, y - 1);
                    break;
                default:
            }
        }

        return answer;
    }

    private void move(int toX, int toY) {
        if (toX < -5 || toX > 5 || toY < -5 || toY > 5) {
            return;
        }

        if (set.add(makePath(this.x, this.y, toX, toY)) && set.add(makePath(toX, toY, this.x, this.y))) {
            this.answer++;
        }

        this.x = toX;
        this.y = toY;
    }

    private String makePath(int x, int y, int toX, int toY) {
        return String.valueOf(x) + y + toX + toY;
    }
}
