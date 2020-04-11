package com.likou.Code1_40;

/**
 * @author: wyh
 * 在排序数组中查找第一个和最后一个位置
 * @Day: 2020/4/1
 */
public class Code34 {
    public static void findNum(int[] nums, int left, int right, int target, int[] res){
        if(right-left==1){
            if(target == nums[left]){
                if(res[0]==-1){
                    res[0] = left;
                }else{
                    res[1] = left;
                }
            }
            if(target == nums[right]){
                if(res[0]==-1){
                    res[0] = right;
                }else{
                    res[1] = right;
                }
            }
            return ;
        }
        if(right==left){
            if(nums[left] ==target) {
                if (res[0] == -1) {
                    res[0] = left;
                } else {
                    res[1] = left;
                }
            }
            return ;
        }
        int middle = (left+right)/2;
        if(nums[middle]>=target&&nums[left]<=target) {
            findNum(nums, left, middle, target, res);
        }
        if(nums[right]>=target&&nums[middle+1]<=target) {
            findNum(nums, middle + 1, right, target, res);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        int left =0,right=length-1;
        int[] res = new int[2];
        for(int i=0;i<2;i++){
            res[i]=-1;
        }
        if(length==0){
            return res;
        }
        findNum(nums,left,right,target,res);
        if(res[0]!=-1&&res[1]==-1){
            res[1] = res[0];
        }
        return res;
    }
}
