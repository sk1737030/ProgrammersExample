package programmers.step2example.kakaoexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Lru 구현으로 문제풀기
 */
public class KaKao1Lru {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LRUCache<String, Integer> lruCache = new LRUCache<>(cacheSize);

        for (String city : cities) {
            Integer integer = lruCache.get(city.toUpperCase());
            lruCache.put(city.toUpperCase(), 0);
            if (integer == null) {
                answer += 5;
            } else {
                answer += 1;
            }
        }


        return answer;
    }

    public class LRUCache<K, V> {
        private static final float hashTableLoadFactor = 0.75f;

        private LinkedHashMap<K, V> map;
        private int cacheSize;

        public LRUCache(int cacheSize) {
            this.cacheSize = cacheSize;
            int hashTableCapacity = (int) Math.ceil(cacheSize / hashTableLoadFactor) + 1;
            map = new LinkedHashMap<>(hashTableCapacity, hashTableLoadFactor, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                    return size() > LRUCache.this.cacheSize;
                }
            };
        }

        public synchronized V get(K key) {
            return map.get(key);
        }

        public synchronized void put(K key, V value) {
            map.put(key, value);
        }

        public synchronized void clear() {
            map.clear();
        }

        public synchronized int usedEntries() {
            return map.size();
        }

        public synchronized Collection<Map.Entry<K, V>> getAll() {
            return new ArrayList<Map.Entry<K, V>>(map.entrySet());
        }
    }


    public static void main(String[] args) {
        KaKao1Lru kaKao1 = new KaKao1Lru();
        //int cacheSize = 3;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"}; //16
        //int cacheSize = 0;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}; // 21
        //int cacheSize = 3;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; // 50
        //int cacheSize = 3;
        //String[] cities = {"Jeju", "Pangyo", "Seoul", "Pangyo", "jeju", "AA", "Seoul", "Pangyo"}; // 50
         //String[] cities = {"Jeju", "Jeju", "Jeju", "Jeju", "Jeju"}; // 50
        System.out.println(kaKao1.solution(cacheSize, cities));

    }
}
