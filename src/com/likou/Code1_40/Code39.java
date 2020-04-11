package com.likou.Code1_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author: wyh
 * 组合总和
 * @Day: 2020/4/2
 */
public class Code39 {
    public static List<List<Integer>> res;

    public static void dp(int[] candidates, int target, int index, Stack<Integer> stack){
        if(target==0){
            res.add(new ArrayList<>(stack));
            return ;
        }
        for(int i=index;i>=0;i--){
            if(target>=candidates[i]){
                stack.push(candidates[i]);
                dp(candidates, target-candidates[i], i, stack);
                stack.pop();
            }
        }
        return ;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        dp(candidates, target, candidates.length-1, new Stack<>());
        return res;
    }
}
