package programmers.test._1_;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Main2 {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> discountGoodsFor10Days = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            String key = discount[i];
            discountGoodsFor10Days.put(key, discountGoodsFor10Days.getOrDefault(key, 0) + 1);
        }

        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 9; i < discount.length; i++) {
            String discountGoods = discount[i];
            discountGoodsFor10Days.put(discountGoods, discountGoodsFor10Days.getOrDefault(discountGoods, 0) + 1);

            // 비교
            boolean[] same = {true};
            wantMap.forEach((s, wantNumber) -> {
                if (!discountGoodsFor10Days.containsKey(s)) {
                    same[0] = false;
                    return;
                }

                Integer discountNumber = discountGoodsFor10Days.get(s);
                if (!Objects.equals(discountNumber, wantNumber)) {
                    same[0] = false;
                }
            });

            if (same[0]) {
                answer++;
            }

            // 제거
            String key = discount[i - 9];
            int disCountGoodsNumber = discountGoodsFor10Days.get(key) - 1;
            if (disCountGoodsNumber == 0) {
                discountGoodsFor10Days.remove(key);
            } else {
                discountGoodsFor10Days.put(key, disCountGoodsNumber);
            }
        }

        return answer;
    }
}