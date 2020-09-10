package com.likou;

/**
 * @author: wyh
 * 水题
 * @Day: 2020/9/10
 */
public class Code492 {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int middle = (int) Math.sqrt(area);
        if(middle*middle==area){
            result[0]=middle;
            result[1] =middle;
        }
        int start = middle;
        while(area%start!=0&&start<=area){
            start+=1;
        }
        result[0]=Math.max(start,area/start);
        result[1]=Math.min(start,area/start);
        return result;
    }
}
