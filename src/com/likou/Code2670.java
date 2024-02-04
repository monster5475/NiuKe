/**
 * @author: wuyh_1
 * @date: 2024年2月04日 19:49:23
 */
package com.likou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();
        for (int num : nums) {
            rightMap.compute(num, (k, v) -> (v == null) ? 1 : v + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            leftMap.compute(num, (k, v) -> (v == null) ? 1 : v + 1);
            if (rightMap.containsKey(num)) {
                if (rightMap.get(num) == 1) {
                    rightMap.remove(num);
                } else {
                    rightMap.compute(num, (k, v) -> v - 1);
                }
            }
            res.add(leftMap.size() - rightMap.size());
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
