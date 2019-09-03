package com.pratice1;

/**
 * @author: wyh
 * 旋转数组的最小数字
 * @Date: 2019/9/3 14:06
 */
public class Code6 {
    public int minNumberInRotateArray(int [] array) {
        int res = 0;
        if(array.length==0) {
            res = 0;
        }else {
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    res = array[i];
                    break;
                }else {
                    res = array[i-1];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Code6 myMain = new Code6();
        int[] array = {3,4,5,1,2};
        int index = myMain.minNumberInRotateArray(array);
        System.out.println(index);
    }
}
