package com.likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wyh
 * 全排列2
 * @Day: 2020/4/6
 */
public class Code47 {
    public static HashMap<String, List<Integer>> hashMap;

    public static void quanpailie(int[] nums, int index){
        if(index==nums.length){
            String str="";
            for(int i=0;i<nums.length;i++){
                str+="," + nums[i];

            }
            hashMap.putIfAbsent(str, Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for(int i=index;i<nums.length;i++){
            int t = nums[i];
            nums[i]=nums[index];
            nums[index] = t;
            quanpailie(nums, index+1);
            t = nums[i];
            nums[i] = nums[index];
            nums[index] = t;
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        hashMap = new HashMap<>();
        int index=0;
        quanpailie(nums, index);
        return new ArrayList<>(hashMap.values());
    }
}
