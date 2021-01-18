package step1example.numberexample;

/**
 * 다른 사람의 풀이
 * https://programmers.co.kr/learn/courses/30/lessons/12912/solution_groups?language=java
 */
public class Number1Another {
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        Number1Another number1Another = new Number1Another();
        System.out.println(number1Another.solution(3, 5)); //12
    }
}
