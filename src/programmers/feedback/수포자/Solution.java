package programmers.feedback.수포자;

import java.util.ArrayList;

public class Solution {
    static class Student {
        private final int id; // 몇 번 학생인지.
        private final int[] answers;
        private int correctAnswerCnt; // 정확한 정답 개수
        private int currentAnswerIndex;

        public Student(final int[] answers, final int id) {
            this.id = id;
            this.answers = answers;
            this.correctAnswerCnt = 0;
            this.currentAnswerIndex = 0;
        }

        public void checkAnswer(final int answer) {
            if (answers[getCurrentAnswerIndex()] == answer) {
                correctAnswer();
            }
        }

        private int getCurrentAnswerIndex() {
            if (currentAnswerIndex == answers.length) {
                currentAnswerIndex = 0;
            }

            return currentAnswerIndex++;
        }

        private void correctAnswer() {
            correctAnswerCnt++;
        }

        public int getCorrectAnswerCnt() {
            return correctAnswerCnt;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    "맞은 개수= " + correctAnswerCnt +
                    '}';
        }
    }

    public int[] solution(final int[] answers) {
        // 수포자들
        Student student1 = new Student(new int[]{1, 2, 3, 4, 5}, 1);
        Student student2 = new Student(new int[]{2, 1, 2, 3, 2, 4, 2, 5}, 2);
        Student student3 = new Student(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}, 3);

        Student[] students = {student1, student2, student3};
        ArrayList<Integer> solution = new ArrayList<>();

        int maxCorrectCnt = 0;

        for (Student student : students) {
            for (int answer : answers) {
                student.checkAnswer(answer);
                maxCorrectCnt = Math.max(student.getCorrectAnswerCnt(), maxCorrectCnt);
            }
        }

        for (Student student : students) {
            if (student.getCorrectAnswerCnt() == maxCorrectCnt) {
                solution.add(student.getId());
            }
        }

        return solution.stream().mapToInt(i -> i).toArray();
    }
}
