package com.likou.Code1_49;

/**
 * @author: wyh
 * 搜索旋转排序数组
 * @Day: 2020/4/1
 */
public class Code33 {
    public static int findNumber(int[] nums, int left, int right, int target){
        if(right-left==1 || right==left){
            if(target==nums[right]){
                return right;
            }else if(target ==nums[left]){
                return left;
            }else{
                return -1;
            }
        }
        int middle = (left+right)/2;
        int res;
        if(nums[left]<nums[middle]){
            if(target<=nums[middle] && target>=nums[left]){
                res = findNumber(nums, left, middle, target);
            }else{
                res =findNumber(nums, middle+1, right, target);
            }
        }else{
            if(target>=nums[middle+1] && target<=nums[right]){
                res =findNumber(nums, middle+1, right, target);
            }else{
                res = findNumber(nums, left, middle, target);
            }
        }
        return res;
    }

    public static int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0, right = length-1;
        if(length==0){
            return -1;
        }
        return findNumber(nums, left, right, target);
    }
}
