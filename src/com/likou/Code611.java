package com.likou;

/**
 * @author: wyh
 * 三角形的判断 水题
 * @Day: 2020/9/5
 */
public class Code611 {
    public int triangleNumber(int[] nums) {
        int length = nums.length;
        int cnt=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    if(nums[i]!=0 && nums[j]!=0 && nums[k]!=0 && nums[i]+nums[j]>nums[k] && nums[i]+nums[k]>nums[j] && nums[k]+nums[j]>nums[i]){
                        cnt+=1;
                    }
                }
            }
        }
        return cnt;
    }
}
