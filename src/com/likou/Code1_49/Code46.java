package com.likou.Code1_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wyh
 * 全排列
 * @Day: 2020/4/6
 */
public class Code46 {

    public List<List<Integer>> arraylist;

    public void quanpailie(int[] nums, int index){
        if(index == nums.length){
            arraylist.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }

        for(int i=index;i<nums.length;i++){
            int t = nums[index];
            nums[index] = nums[i];
            nums[i] = t;
            quanpailie(nums, index+1);
            t = nums[i];
            nums[i]= nums[index];
            nums[index] = t;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        arraylist = new ArrayList<>();
        int index=0;
        quanpailie(nums, index);
        return arraylist;
    }
}
