package filpexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Filp1 {
    public int solution(int n) {
        String[] intArray = Integer.toString(n, 3).split("");
        List<String> intList = Arrays.asList(intArray);
        Collections.reverse(intList);
        String reversedN = String.join("", intList);

        return Integer.valueOf(reversedN, 3);
    }


    public static void main(String[] args) {
        Filp1 filp1 = new Filp1();
        int n1 = 11;
        System.out.println(filp1.solution(n1)); // 19
    }
}
