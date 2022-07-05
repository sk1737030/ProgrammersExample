package programmers.feedback.방문길이;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution2 {
    Set<Path> set = new HashSet<>();
    private int currentX = 0;
    private int currentY = 0;

    public int solution(String dirs) {
        int dirLength = dirs.length();

        for (int i = 0; i < dirLength; i++) {
            char c = dirs.charAt(i);
            if (c == 'U') {
                move(currentX, currentY, currentX, currentY + 1);
            } else if (c == 'D') {
                move(currentX, currentY, currentX, currentY - 1);
            } else if (c == 'L') {
                move(currentX, currentY, currentX + 1, currentY);
            } else {
                move(currentX, currentY, currentX - 1, currentY);
            }
        }

        return set.size();
    }

    private void move(int x, int y, int toX, int toY) {
        if (isCorrectXY(toX, toY)) {
            currentX = toX;
            currentY = toY;
            set.add(Path.makePath(x, y, toX, toY));
        }
    }

    private static boolean isCorrectXY(int toX, int toY) {
        return toX >= -5 && toX <= 5 && toY >= -5 && toY <= 5;
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


