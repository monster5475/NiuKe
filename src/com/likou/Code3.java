package com.likou;

import java.util.LinkedList;

/**
 * @author: wyh
 * 无重复字符的最长子串
 * @Day: 2020/3/12
 */
public class Code3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        LinkedList<Character> queue1 = new LinkedList<Character>();
        int length = s.length();
        int[] dp = new int[length];
        dp[0] = 1;
        queue1.offer(s.charAt(0));
        for(int i=1;i<length;i++){
            if(queue1.contains(s.charAt(i))){
                while(queue1.element()!=s.charAt(i)){
                    queue1.poll();
                }
                queue1.poll();
                queue1.offer(s.charAt(i));
            }else{
                queue1.offer(s.charAt(i));
            }
            dp[i] = queue1.size();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
