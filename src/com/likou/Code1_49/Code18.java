package com.likou.Code1_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wyh
 * 四数之和
 * @Day: 2020/4/13
 */
public class Code18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> tlist = new ArrayList<>();
        int length = nums.length;
        if(length<4){
            return tlist;
        }
        for(int a=0;a<length-3;a++){
            if(a>0&&nums[a] == nums[a-1]){
                continue;
            }
            for(int b=a+1; b<length-2;b++){
                if(b>a+1&&nums[b] ==nums[b-1]){
                    continue;
                }
                int left = b+1, right = length-1;
                while(left<right){
                    int t=nums[a]+nums[b]+nums[left]+nums[right];
                    if(t>target){
                        right-=1;
                    }else if(t<target){
                        left+=1;
                    }else{
                        List<Integer> r = new ArrayList<>();
                        r.add(nums[a]);
                        r.add(nums[b]);
                        r.add(nums[left]);
                        r.add(nums[right]);
                        tlist.add(r);
                        while(left<right&&nums[left]==nums[left+1]){
                            left+=1;
                        }
                        while(left<right&&nums[right]==nums[right-1]){
                            right-=1;
                        }
                        left+=1;
                        right-=1;
                    }
                }
            }
        }
        return tlist;
    }
}
