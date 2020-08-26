package com.likou;

import java.util.HashMap;

/**
 * @Author wyh
 * @Description 前缀和
 * @Date: 2020 08 26 下午4:26
 */
public class Code525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count=0, maxLen = 0;
        hashMap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }else{
                count-=1;
            }
            if(hashMap.containsKey(count)){
                maxLen = Math.max(maxLen, i-hashMap.get(count));
            }else{
                hashMap.put(count,i);
            }
        }
        return maxLen;
    }
}
