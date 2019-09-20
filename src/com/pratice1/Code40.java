package com.pratice1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: wyh
 * 和为s 的连续整数序列
 * @Date: 2019/9/17 13:29
 */
public class Code40 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int s;
        for(int i=1; i<=sum/2+1; i++){
            s=i;
            for(int j=i+1; j<=sum/2+2; j++){
                s+=j;
                if(s>sum){
                    break;
                }else if(s==sum){
                    result.add(Stream.iterate(i, x->x+1)
                            .limit(j-i+1)
                            .collect(Collectors.toCollection(ArrayList::new))
                    );
                    break;
                }
            }
        }
        return result;
    }
}
