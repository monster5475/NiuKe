package com.likou;

import java.util.Arrays;

/**
 * @author: wyh
 * @Date: 2020/9/22 15:44
 */
public class Code435 {
    public static class Block{
        public int start;
        public int end;
        public Block(int start, int end){
            this.start = start;
            this.end = end;
        }
        public int getStart(){
            return this.start;
        }
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        if(length==0){
            return 0;
        }
        Block[] blocks = new Block[length];
        for(int i=0;i<length;i++){
            blocks[i] = new Block(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(blocks, (b1, b2)->{
            if(b1.end>b2.end){
                return 1;
            }else if(b1.end<b2.end){
                return -1;
            }else{
                return 0;
            }
        });
        int index=0, cnt=0, lastEnd = blocks[0].end;
        while (index<length){
            if(index!=length-1){
                if(blocks[index+1].start<lastEnd){
                    cnt+=1;
                }else{
                    lastEnd = blocks[index+1].end;
                }
            }
            index+=1;
        }
        return cnt;
    }
}
