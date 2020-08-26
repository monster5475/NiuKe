package com.likou;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wyh
 * @Description 递增子序列 回溯+剪枝
 * @Date: 2020 08 26 上午11:29
 */
public class Code491 {
    public static List<List<Integer>> result;
    public static int[] numbers;

    public static void dfs(int end, int last, ArrayList<Integer> arrayList){
        if(end == numbers.length){
            if(arrayList.size()>=2){
                result.add(new ArrayList<>(arrayList));
            }
            return;
        }
        if (numbers[end] >= last) {
            arrayList.add(numbers[end]);
            dfs(end + 1, numbers[end], arrayList);
            arrayList.remove(arrayList.size()-1);
        }
        if (numbers[end] != last) {
            dfs(end + 1, last, arrayList);
        }
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        numbers = nums;
        result = new ArrayList<>();

        int length = nums.length;
        if(length<2){
            return result;
        }
        dfs(0, Integer.MIN_VALUE, new ArrayList<>());
        return result;
    }
}
