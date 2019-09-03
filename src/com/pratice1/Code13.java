package com.pratice1;

/**
 * @author: wyh
 * 调整数组的顺序使奇数在前
 * @Day: 2019/9/3
 */
public class Code13 {
    public void reOrderArray(int [] array) {
        int[] temp= new int[array.length];
        int[] old= new int[array.length];
        int index = 0, index1 = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2 != 0){
                temp[index++] = array[i];
            }else{
                old[index1++] = array[i];
            }
        }
        for(int i=0;i<index;i++){
            array[i] =temp[i];
        }
        for(int i=0;i<index1;i++){
            array[index+i] =old[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Code13 myMain = new Code13();
        myMain.reOrderArray(array);
        // System.out.println(index);
    }
}
