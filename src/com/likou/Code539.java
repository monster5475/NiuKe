package com.likou;

import java.util.List;

/**
 * @Author wyh
 * @Description 简单题
 * @Date: 2020 08 19 下午2:44
 */
public class Code539 {
    public static int getMin(String s1 ,String s2){
        String str1 = s1.compareTo(s2)>=1?s1:s2;
        String str2 = s1.compareTo(s2)>=1?s2:s1;
        String[] time1 = str1.split(":");
        String[] time2 = str2.split(":");
        int time1_h = Integer.parseInt(time1[0]);
        int time1_m = Integer.parseInt(time1[1]);
        int time2_h = Integer.parseInt(time2[0]);
        int time2_m = Integer.parseInt(time2[1]);
        int mm1= (23-time1_h+time2_h)*60+(60-time1_m+time2_m);
        int mm2= (time1_h-time2_h)*60 + time1_m-time2_m;
        return Math.min(mm1,mm2);
    }

    public static int findMinDifference(List<String> timePoints) {
        int min=Integer.MAX_VALUE;
        timePoints.sort(String::compareTo);
        for(int i=0;i<timePoints.size()-1;i++){
            min = Math.min(min,getMin(timePoints.get(i), timePoints.get(i+1)));
        }
        min = Math.min(min, getMin(timePoints.get(timePoints.size()-1),timePoints.get(0)));
        return min;
    }
}
