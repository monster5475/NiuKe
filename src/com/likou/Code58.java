package com.likou;

/**
 * @author: wyh
 * 最后一个单词的长度
 * @Day: 2020/4/21
 */
public class Code58 {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        if(ss.length==0){
            return 0;
        }else{
            return ss[ss.length-1].length();
        }
    }
}
