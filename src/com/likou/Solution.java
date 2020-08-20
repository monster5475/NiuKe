package com.likou;


import java.util.*;
import java.util.stream.IntStream;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arraylists = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> array = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                array.add(1);
            }
            arraylists.add(array);
        }
        for(int i=1;i<numRows;i++){
            List<Integer> array = arraylists.get(i);
            array.set(0,1);
            array.set(array.size()-1,1);
            List<Integer> last = arraylists.get(i-1);
            for(int j=1;j<array.size()-1;j++){
                array.set(j, last.get(j-1)+last.get(j));
            }
        }
        return arraylists;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        nums = rearrangeBarcodes(nums);
        IntStream.of(nums).forEach(System.out::println);

    }
}
