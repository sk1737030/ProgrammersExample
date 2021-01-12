package kakaoexample;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * [1차] 다트 게임
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */
public class KaKao3 {

    public static int multi = 0;

    public int solution(String dartResult) {
        int answer = 0;

        String[] numberExt =
                Stream.of(dartResult.replaceAll("(\\D)", ",").split(","))
                        .filter(s -> s.length() > 0).toArray(String[]::new);
        String[] chars = dartResult.replaceAll("[0-9]", "").split("");

        Stack<String> numberStack = new Stack<>();
        Stack<String> charStack = new Stack<>();

        numberStack.addAll(Arrays.asList(numberExt));
        charStack.addAll(Arrays.asList(chars));

        int sum = 0;
        String event = "";

        while (!numberStack.isEmpty()) {
            String pop = charStack.pop();
            String pop1 = numberStack.pop();
            int numbers = Integer.parseInt(pop1);
            int extracted = extracted(charStack, pop, numbers);
            sum += extracted;
            multi--;
        }

        return sum;
    }

    private int extracted(Stack<String> s, String pop, int numbers) {
        Integer event = 1; // *
        Integer event2 = 1; // #

        if (pop.equals("*")) {
            if (!s.isEmpty()) {
                pop = s.pop();
            }

            event = 2;
            if (multi >= 1) {
                event = 4;
            }

            multi = 2;
        }

        if (multi == 1) {
            event = 2;
        }

        if (pop.equals("#")) {
            event2 = -1;
            pop = s.pop();
        }

        switch (pop) {
            case "D":
                numbers = Math.multiplyExact((int) Math.pow(numbers, 2), event) * event2;
                break;
            case "T":
                numbers = Math.multiplyExact((int) Math.pow(numbers, 3), event) * event2;
                break;
            case "S":
                numbers = Math.multiplyExact((int) Math.pow(numbers, 1), event) * event2;
                break;
        }

        return numbers;
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        KaKao3 kaKao3 = new KaKao3();
        String dartResult = "1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1S*2T*3S";
        String dartResult4 = "1D2S3T*";
        String dartResult5 = "1T2D3D#";
        //System.out.println(kaKao3.solution(dartResult));// 37
        multi = 0;
        //System.out.println(kaKao3.solution(dartResult2));// 9
        multi = 0;
        //System.out.println(kaKao3.solution(dartResult3)); // 23
        multi = 0;
        //System.out.println(kaKao3.solution(dartResult4));//
        multi = 0;
        System.out.println(kaKao3.solution(dartResult5));// -4
    }
}
