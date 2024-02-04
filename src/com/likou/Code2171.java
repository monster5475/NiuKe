/**
 * @author: wuyh_1
 * @date: 2024年1月26日 18:02:11
 */
package com.likou;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code2171 {
    public long minimumRemoval(int[] beans) {
        if (beans.length == 0) {
            return 0;
        }
        List<Integer> beanList = Arrays.stream(beans).boxed().collect(Collectors.toList());
        beanList.sort(Collections.reverseOrder());

        long minNum = 0;
        long sumNum = 0;
        long size = beanList.size();
        for (Integer bean : beanList) {
            if (bean != beanList.get(0)) {
                minNum += bean;
            }
            sumNum += bean;
        }

        Map<Integer, Long> map = beanList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Integer> beanDistinceList = beanList.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        if (beanDistinceList.size() == 1) {
            return 0;
        }

        for (Integer bd : beanDistinceList) {
            long s = sumNum - size * bd;
            minNum = Math.min(minNum, s);
            size -= map.get(bd);
        }

        return minNum;
    }

}
