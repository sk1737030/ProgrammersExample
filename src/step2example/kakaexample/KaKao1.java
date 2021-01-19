package step2example.kakaexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Cache
 *
 */
public class KaKao1 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> lru = new ArrayList<>(cacheSize);
        for (String s : cities) {
            String city = s.toUpperCase();

            if (lru.contains(city)) {
                answer += 1;
            } else {
                answer += 5;
            }

            lru.add(city);

            if (lru.size() > cacheSize) {
                int i1 = lru.indexOf(city);
                if (i1 == -1 || i1 == lru.size() - 1) {
                    lru.remove(0);
                } else {
                    lru.remove(i1);
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        KaKao1 kaKao1 = new KaKao1();
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        //int cacheSize = 2;
        //String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"}; //16
        //int cacheSize = 0;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; // 21
        //int cacheSize = 3;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; // 50
        //int cacheSize = 3;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "Pangyo", "jeju", "AA", "Seoul", "Pangyo"}; // 50
        // String[] cities = {"Jeju", "Jeju", "Jeju", "Jeju", "Jeju"}; // 50
        System.out.println(kaKao1.solution(cacheSize, cities));

    }
}
