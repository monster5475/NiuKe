package com.likou.Code1_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wyh
 * 三数之和
 * @Day: 2020/3/17
 */
public class Code15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> tlist  = new ArrayList<>();
        int target = 0;
        for(int i=0;i<length-2;i++){
            if(i>0&& nums[i]==nums[i-1]){
                continue;
            }
            if((target = nums[i])>0){
                break;
            }
            int l = i+1, r = length-1;
            while(l<r){
                if(nums[l]+nums[r]+target <0){
                    l+=1;
                }else if(nums[l]+nums[r]+target>0){
                    r-=1;
                }else{
                    List<Integer> list = new ArrayList();
                    list.add(nums[r]);
                    list.add(nums[l]);
                    list.add(target);
                    tlist.add(list);
                    l+=1;
                    r-=1;
                    while(l<r && nums[l]==nums[l-1]) {
                        l+=1;
                    }
                    while(l<r&&nums[r] ==nums[r+1]){
                        r-=1;
                    }
                }
            }
        }
        return tlist;
    }
}
