package step2example.kakaexample;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 파일명 정렬
 * https://programmers.co.kr/skill_checks/234535?challenge_id=2441
 */
public class KaKao2 {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];

        Stream<String> sorted = Arrays.stream(files).sorted((o1, o2) -> {
            String[] o1Chars = o1.split("[0-9]");
            String[] o1Numbers = o1.split("[^0-9]");
            String[] o2Chars = o2.split("[0-9]");
            String[] o2Numbers = o2.split("[^0-9]");
            int compareValueOfChars = o1Chars[0].toUpperCase().compareTo(o2Chars[0].toUpperCase());
            if (compareValueOfChars == 0) {
                int[] ints1 = Arrays.stream(o1Numbers).filter(s -> s.length() > 0).mapToInt(Integer::parseInt).toArray();
                int[] ints2 = Arrays.stream(o2Numbers).filter(s -> s.length() > 0).mapToInt(Integer::parseInt).toArray();

                return Integer.compare(ints1[0], ints2[0]);
                //return Arrays.compare(ints1, ints2);
            }

            return compareValueOfChars;
        });

        sorted.map(String::valueOf).collect(Collectors.toList()).toArray(answer);

        return answer;
    }

    public static void main(String[] args) {
        KaKao2 kaKao2 = new KaKao2();



        //String[] arr = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        //String[] arr = {"img123 .Ang1234", "img123.jpg ", "img0010.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG", "img12.JP1G", "img0012.pn1g"};
        String[] arr = {"img123 .Ang1234", "img123.jpg "};
        //String[] arr = {"Amg02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        //String[] arr = { "A00991as.zi11p", "A0101.zip11","bb02", "ab02","aB01","aB021234","a0991asd.jp11g"};
        System.out.println(Arrays.toString(kaKao2.solution(arr)));
    }
}
