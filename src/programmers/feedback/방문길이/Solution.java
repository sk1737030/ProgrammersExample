package programmers.feedback.방문길이;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {

    Set<Path> set = new HashSet<>();

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

        if (set.add(Path.makePath(this.x, this.y, toX, toY))) {
            this.answer++;
        }

        this.x = toX;
        this.y = toY;
    }


    static class Path {
        int x;
        int y;
        int toX;
        int toY;

        private Path() {
        }

        private Path(int x, int y, int toX, int toY) {
            this.x = x;
            this.y = y;
            this.toX = toX;
            this.toY = toY;
        }

        public static Path makePath(int x, int y, int toX, int toY) {
            return new Path(x, y, toX, toY);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Path path = (Path) o;
            return (x == path.x && y == path.y && toX == path.toX && toY == path.toY)
                    || (x == path.toX && y == path.toY && toX == path.x && toY == path.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, toX, toY) + Objects.hash(toX, toY, x, y);
        }

        @Override
        public String toString() {
            return "Path{" +
                    "x=" + x +
                    ", y=" + y +
                    ", toX=" + toX +
                    ", toY=" + toY +
                    '}';
        }
    }
}
