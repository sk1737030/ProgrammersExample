package inflearn.array.임시반장_정하기;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 30분 넘음
 * 다시풀기
 */

public class Main {

    public static class Student implements Comparable<Student> {

        int number;

        Set<Integer> sameClassStudentName = new HashSet<>();

        public Student(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void plusSameClassStudent(int otherStudentNumber) {
            this.sameClassStudentName.add(otherStudentNumber);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return number == student.number && Objects.equals(sameClassStudentName, student.sameClassStudentName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, sameClassStudentName);
        }

        @Override
        public int compareTo(Student o) {
            return Integer.compare(this.sameClassStudentName.size(), o.sameClassStudentName.size());
        }
    }

    public int solution(int n, int[][] arr) {
        TreeSet<Student> students = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student(i + 1);

            for (int k = 0; k < 5; k++) {
                int studentClass = arr[i][k];

                for (int j = 0; j < n; j++) {
                    int otherStudentClass = arr[j][k];

                    if (studentClass == otherStudentClass) {
                        student.plusSameClassStudent(j);
                    }
                }
            }

            students.add(student);
        }

        return students.last().getNumber();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(n, arr);
        System.out.println(answer);


    }


}
