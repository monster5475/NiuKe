package com.likou.Code1_40;

/**
 * @author: wyh
 * 下一个排序
 * @Day: 2020/3/31
 */
public class Code31 {
    public static int[] nextPermutation(int[] nums) {
        int length = nums.length;
        int count=0;
        for(int i=length-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                count+=1;
            }
        }
        if(count==length-1){
            for(int i=0;i<length/2;i++){
                int t = nums[i];
                nums[i] = nums[length-1-i];
                nums[length-1-i] = t;
            }
            return nums;
        }
        if(nums[length-1]>nums[length-2]){
            int t = nums[length-1];
            nums[length-1] = nums[length-2];
            nums[length-2] = t;
        }else{
            int index=-1,index_=-1;
            int min = Integer.MAX_VALUE;
            for(int i=length-1;i>0;i--){
                if(nums[i]>nums[i-1]){
                    index = i-1;
                    break;
                }
            }
            for(int i=length-1;i>index;i--){
                if(nums[i]>nums[index]&&nums[i]<min){
                    min = nums[i];
                    index_ = i;
                }
            }
            int t = nums[index];
            nums[index] = nums[index_];
            nums[index_] = t;
            for(int i=index+1;i<length;i++){
                for(int j=i+1;j<length;j++){
                    if(nums[i]>nums[j]){
                        int tt = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tt;
                    }
                }
            }
        }
        return nums;
    }
}
