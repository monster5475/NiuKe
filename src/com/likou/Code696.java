package com.likou;

import java.util.ArrayList;

/**
 * @Author wyh
 * @Description 找出不同的点向两边扩展
 * @Date: 2020 08 10 上午10:50
 */
public class Code696 {
    public static int countBinarySubstrings(String s) {
        int length = s.length();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<length-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){
                arrayList.add(i);
            }
        }
        int sum = arrayList.size();
        for(Integer i: arrayList){
            int left = i, right = i+1;
            left -=1;
            right+=1;
            while (left>=0 && right<length){
                if(s.charAt(left) ==s.charAt(i) && s.charAt(i+1) == s.charAt(right)){
                    left-=1;
                    right+=1;
                    sum+=1;
                }else{
                    break;
                }
            }
        }
        return sum;
    }
}
