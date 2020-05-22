package com.likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: wyh
 * 插入区间
 * @Day: 2020/4/21
 */
public class Code57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int length = intervals.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<length;i++){
            if(intervals[i][1]<newInterval[0] || intervals[i][0]>newInterval[1]){
                List<Integer> r= new ArrayList<>();
                r.add(intervals[i][0]);
                r.add(intervals[i][1]);
                res.add(r);
            }else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        List<Integer> r= new ArrayList<>();
        r.add(newInterval[0]);
        r.add(newInterval[1]);
        res.add(r);
        int[][] ret = new int[res.size()][2];
        QJ[] qjs = new QJ[res.size()];
        for(int i=0;i<res.size();i++){
            qjs[i] = new QJ(res.get(i).get(0),res.get(i).get(1));
        }
        Arrays.sort(qjs, Comparator.comparingInt(QJ::getStart));
        for(int i=0;i<res.size();i++){
            ret[i][0] = qjs[i].start;
            ret[i][1] = qjs[i].end;
        }
        return ret;
    }
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
}
