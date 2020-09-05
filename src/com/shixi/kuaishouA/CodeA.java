package com.shixi.kuaishouA;

/**
 * @author: wyh
 * 与更高者的距离
 * @Day: 2020/3/22
 */
public class CodeA {
    public static int[] DistanceToHigher (int[] height) {
        // write code here
        int length=height.length;
        int[] array = new int[length];
        array[0] = 0;
        for(int i=1;i<length;i++){
            int index=i;
            for(int j=i-1;j>=0;j--){
                if(height[i]<height[j]){
                    index = j;
                    break;
                }
            }
            array[i] = i-index;
        }
        return array;
    }
}
