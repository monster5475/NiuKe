package com.likou;

/**
 * @Author wyh
 * @Description 双指针模拟前进，注意边界考虑
 * @Date: 2020 08 13 下午9:02
 */
public class Code1732 {
    public static int findClosest(String[] words, String word1, String word2) {
        int start = -10000,end = 10000,min =10000;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                start = i;
            }
            if(words[i].equals(word2)){
                end = i;
            }
            min = Math.min(min, Math.abs(end-start));
        }
        return min;
    }
}
