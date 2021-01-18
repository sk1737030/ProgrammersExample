package step1example.stringexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String7Another {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public String[] solution2(String[] strings, int n) {
        List<String> list = Arrays.asList(strings);
        list.sort((a, b) -> {
            int result = (a.split(""))[n].compareTo((b.split(""))[n]);
            if (result == 0)
                return a.compareTo(b);
            return result;
        });
        return list.toArray(new String[0]);
    }


    public static void main(String[] args) {
        String7Another string7 = new String7Another();
        String[] a = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(string7.solution(a, 1))); // "car", "bed", "sun"
        System.out.println(Arrays.toString(string7.solution2(a, 1))); // "car", "bed", "sun"

    }
}
