package codility.missinginteger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] A) {

        List<Integer> collect = Arrays.stream(A).boxed()
            .filter(integer -> integer >= 0)
            .collect(Collectors.toList());

        Collections.sort(collect);

        if (collect.isEmpty() || collect.get(0) > 1) {
            return 1;
        }

        if (collect.size() == 1 && collect.get(0) == 1) {
            return 2;
        }

        Integer before = collect.get(0);

        for (Integer integer : collect) {
            if (before == integer) {
                continue;
            }

            if (before + 1 != integer) {
                return before + 1;
            }

            before = integer;
        }

        return collect.get(collect.size() - 1) + 1;
    }
}
