package com.likou;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author wyh
 * @Description 水题
 * @Date: 2020 08 14 下午7:20
 */
public class Code506 {
    public static class Sporter{
        public int value;
        public int index;
        public Sporter(int value, int index){
            this.value=value;
            this.index=index;
        }

        public int getValue() {
            return value;
        }
    }

    public static String[] findRelativeRanks(int[] nums) {
        int index=0;
        Sporter[] sporters = new Sporter[nums.length];
        for(int num:nums){
            Sporter sporter = new Sporter(num,index++);
            sporters[index-1] = sporter;
        }
        Arrays.sort(sporters, Comparator.comparingInt(Sporter::getValue).reversed());
        String[] results = new String[nums.length];
        index=0;
        for(Sporter sporter:sporters){
            if(index==0){
                results[sporter.index] = "Gold Medal";
            }else if(index==1){
                results[sporter.index] = "Silver Medal";
            }else if(index==2){
                results[sporter.index] = "Bronze Medal";
            }else {
                results[sporter.index] = String.valueOf(index+1);
            }
            index++;
        }
        return results;
    }
}
