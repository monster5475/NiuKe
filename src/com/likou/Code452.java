package com.likou;

import java.util.Arrays;

/**
 * @author: wyh
 * 贪心 + 更新最大值条件
 * @Date: 2020/9/22 16:06
 */
public class Code452 {
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

    public static int findMinArrowShots(int[][] points) {
        int length = points.length;
        Block[] blocks = new Block[length];
        for(int i=0;i<length;i++){
            blocks[i] = new Block(points[i][0], points[i][1]);
        }
        int result = 0;
        Arrays.sort(blocks, (b1, b2)->{
            if(b1.start>b2.start){
                return 1;
            }else if(b1.start == b2.start){
                if(b1.end<b2.end){
                    return 1;
                }else if(b1.end == b2.end){
                    return 0;
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        });
        int i=0;
        while (i<length){
            int j=i+1 ,lastEnd = blocks[i].end;
            while (j<length && blocks[j].start<=lastEnd){
                if(blocks[j].end<lastEnd){
                    lastEnd = blocks[j].end;
                }
                j+=1;
            }
            i=j;
            result +=1;
        }
        return result;
    }
}
