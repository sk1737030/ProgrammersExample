package programmers.step1example.kakaoexample;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * [1차] 다트 게임
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */
public class KaKao3 {

    public int multiPleCount = 0; // 1S*2S* 일경우 처리를위해

    public int solution(String dartResult) {

        List<String> numberExt = Stream.of(dartResult.replaceAll("(\\D)", ",").split(","))
                .filter(s -> s.length() > 0)
                .collect(Collectors.toList());

        List<String> chars = Arrays.stream(dartResult.replaceAll("[0-9]", "").split(""))
                .collect(Collectors.toList());

        Stack<String> numberStack = new Stack<>();
        Stack<String> charStack = new Stack<>();

        numberStack.addAll(numberExt);
        charStack.addAll(chars);

        int sum = 0;

        while (!numberStack.isEmpty()) {
            String pop = charStack.pop();
            int number = Integer.parseInt(numberStack.pop());
            int extracted = extracted(charStack, pop, number);
            sum += extracted;
            multiPleCount--;
        }

        return sum;
    }

    private int extracted(Stack<String> s, String chars, int number) {
        int multipleEvent = 1; // *
        int minusMultipleEvent = 1; // #

        if (chars.equals("*")) {
            if (!s.isEmpty()) {
                chars = s.pop();
            }

            multipleEvent = 2;
            if (multiPleCount >= 1) {
                multipleEvent = 4;
            }

            multiPleCount = 2;
        }

        if (multiPleCount == 1) {
            multipleEvent = 2;
        }

        if (chars.equals("#")) {
            minusMultipleEvent = -1;
            chars = s.pop();
        }

        switch (chars) {
            case "D":
                number = ((int) Math.pow(number, 2)) * multipleEvent * minusMultipleEvent;
                break;
            case "T":
                number = ((int) Math.pow(number, 3)) * multipleEvent * minusMultipleEvent;
                break;
            case "S":
                number = ((int) Math.pow(number, 1)) * multipleEvent * minusMultipleEvent;
                break;
            default:
        }

        return number;
    }

    public static void main(String[] args) {
        KaKao3 kaKao3 = new KaKao3();
        String dartResult = "1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1S*2T*3S";
        String dartResult4 = "1D2S3T*";
        String dartResult5 = "1T2D3D#";
        //System.out.println(kaKao3.solution(dartResult));// 37
        //System.out.println(kaKao3.solution(dartResult2));// 9
        //System.out.println(kaKao3.solution(dartResult3)); // 23
        //System.out.println(kaKao3.solution(dartResult4));//
        System.out.println(kaKao3.solution(dartResult5));// -4
    }
}
