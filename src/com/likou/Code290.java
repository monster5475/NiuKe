package com.likou;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuyh_1
 * @date 2022/7/21 14:51
 */
public class Code290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        if (ss.length != pattern.length()) {
            return false;
        }
        for(int i=0; i<ss.length; i++) {
            Character ch = pattern.charAt(i);
            if(map1.containsKey(ss[i])) {
                if (!ch.equals(map1.get(ss[i]))) {
                    return false;
                }
            }
            if(!map.containsKey(ch)) {
                map.put(ch, ss[i]);
                map1.put(ss[i], ch);
            } else {
                if (!ss[i].equals(map.get(ch))) {
                    return false;
                }
            }
        }
        return true;
    }
}
