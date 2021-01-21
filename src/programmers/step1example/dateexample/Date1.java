package programmers.step1example.dateexample;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * 2016년
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */

public class Date1 {
    public String solution(int a, int b) {
        String answer = "";
     /*
         https://d2.naver.com/helloworld/645609
     Calendar instance = Calendar.getInstance();
        instance.set(2016, a, b);
        int i = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(i);*/

        LocalDateTime localDateTime = LocalDateTime.of(2016, a, b, 0, 0);
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        switch (dayOfWeek.getValue()) {
            case 1:
                return "MON";
            case 2:
                return "TUE";
            case 3:
                return "WED";
            case 4:
                return "THU";
            case 5:
                return "FRI";
            case 6:
                return "SAT";
            default:
                return "SUN";
        }
    }

    public static void main(String[] args) {
        Date1 date = new Date1();
        System.out.println(date.solution(5, 24)); // "TUE"
    }
}
