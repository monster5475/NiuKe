package com.likou.Code1_40;

/**
 * @author: wyh
 * 寻找两个有序数组的中位数
 * @Day: 2020/3/12
 */
public class Code4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (findN(nums1,0,nums2,0,left) + findN(nums1,0,nums2,0, right))/2.0;
    }

    public static double findN(int[] nums1, int i, int[] nums2, int j, int k){
        if(i>nums1.length) {
            return nums2[j+k-1];
        }
        if(j>nums2.length){
            return nums1[i+k-1];
        }
        if(k==1){
            return Math.max(nums1[i], nums2[j]);
        }
        int midValue1 = (i+k/2-1)>nums1.length?Integer.MAX_VALUE:nums1[i+k/2-1];
        int midValue2 = (j+k/2-1)>nums2.length?Integer.MAX_VALUE:nums2[j+k/2-1];
        if(midValue1<midValue2){
            return findN(nums1, i+k/2, nums2, j, k-k/2);
        }else{
            return findN(nums1, i, nums2, j+k/2, k-k/2);
        }
    }
}
