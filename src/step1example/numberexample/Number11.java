package step1example.numberexample;

/**
 * 하샤드 수
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 */
public class Number11 {
    public boolean solution(int x) {
        int a = 0;
        int tempX = x;
        while (tempX > 0){
            int i = tempX % 10;
            a = a + i;

            if (x < 10)
                break;
            tempX = tempX / 10;
        }

        return x % a == 0;
    }

    public static void main(String[] args) {
        Number11 number11 = new Number11();
        int x = 12;
        number11.solution(x); // false
    }
}
