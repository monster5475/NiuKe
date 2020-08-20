package com.likou;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wyh
 * @Description 简单题，数据结构理解即可
 * @Date: 2020 08 13 下午6:39
 */
public class Code677 {
    HashMap<String, Integer> map;

    public Code677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        return map.entrySet()
                .stream()
                .filter(entry->entry.getKey().startsWith(prefix))
                .map(Map.Entry::getValue)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
