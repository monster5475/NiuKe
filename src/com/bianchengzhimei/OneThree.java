package com.bianchengzhimei;

/**
 * 烧饼翻转  剪枝 缩小搜索空间
 * @author: wyh
 * @Day: 2019/11/26
 */
public class OneThree {

    public void reverse(int[] numbers){

    }

    public int countReverseTimes(int[] numbers){

        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 4, 6, 7, 3, 9, 1, 2};
        OneThree oneThree = new OneThree();
        int count = oneThree.countReverseTimes(numbers);
        System.out.println(count);
    }
}
