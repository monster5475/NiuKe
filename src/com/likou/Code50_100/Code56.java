package com.likou.Code50_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: wyh
 * 合并区间
 * @Day: 2020/4/20
 */
public class Code56 {
    public static class QJ{
        public int start;
        public int end;
        public QJ(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }
    }

    public static int[][] merge(int[][] intervals) {
        int length = intervals.length;
        QJ[] qjs = new QJ[length];
        for(int i=0;i<length;i++){
            qjs[i] = new QJ(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(qjs, Comparator.comparingInt(QJ::getStart));
        int i=0;
        for(i=0;i<qjs.length-1;i++){
            if(qjs[i].end>=qjs[i+1].end){
                qjs[i+1].end = qjs[i].end;
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        i=0;
        while (i<length){
            int j=i+1;
            int start = i;
            while (j<length&&qjs[i].end>=qjs[j].start){
                i=j;
                j+=1;
            }
            List<Integer> list = new ArrayList<>();
            list.add(qjs[start].start);
            list.add(qjs[j-1].end);
            res.add(list);
            i=j;
        }
        int[][] resArray= new int[res.size()][2];
        for(i=0;i<res.size();i++){
            resArray[i][0] = res.get(i).get(0);
            resArray[i][1] = res.get(i).get(1);
        }
        return resArray;
    }
}
