package com.pratice1;

/**
 * @author: wyh
 * 数组中的逆序对
 * @Date: 2019/9/16 16:44
 */
public class Code34 {
    public void halfShow(int[] array, int begin, int end){
        if(begin == end) {
            return ;
        }
        int middle = (begin + end)/2;
        halfShow(array,begin, middle);
        halfShow(array, middle+1, end);
        merge(array, begin, middle, end);
    }

    public void merge(int[] array, int begin,int middle, int end){
        int[] left = new int[middle-begin+1];
        int[] right = new int[end-middle];
        System.arraycopy(array,begin,left,0,middle-begin+1);
        System.arraycopy(array,middle+1,right,0,end-middle);
        int i=begin,j=0,k=0;
        while(i<=end&&j!=left.length&&k!=right.length){
            if(left[j]<right[k]){
                array[i++] = left[j++];
                // sum +=right.length-k;
            }else{
                array[i++] = right[k++];
                sum +=left.length-j;
            }
        }
        if(j==left.length){
            while(k!=right.length){
                array[i++] = right[k++];
            }
        }else{
            while(j!=left.length){
                array[i++] = left[j++];
            }
        }
    }
    int sum = 0;

    public int InversePairs(int [] array) {
        int count = 0;
        halfShow(array, 0, array.length-1);
        return count;
    }
}
