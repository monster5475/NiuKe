package com.likou.Code1_49;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: wyh
 * @Day: 2020/4/2
 */
public class Code40 {
    public static HashMap<String, List<Integer>> res;

    public static void dp(int[] candidates, int target, int index, Stack<Integer> stack){
        if(target==0){
            ArrayList<Integer> list = new ArrayList<>(stack);
            Collections.sort(list);
            String str = "";
            for(Integer integer:list){
                str+=integer+",";
            }
            if(!res.containsKey(str)){
                res.put(str, list);
            }
            return ;
        }
        for(int i=index;i>=0;i--){
            if(target>=candidates[i]){
                stack.push(candidates[i]);
                dp(candidates, target-candidates[i], i-1, stack);
                stack.pop();
            }
        }
        return ;
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new HashMap<>();
        Arrays.sort(candidates);
        dp(candidates, target, candidates.length-1, new Stack<>());
        return res.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}
