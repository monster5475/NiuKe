package com.likou;

/**
 * @author: wyh
 * 数组记录状态，左位置表示右端点，右端点表示左位置
 * @Day: 2020/9/5
 */
public class Code1562 {
    public static int findLatestStep(int[] arr, int m) {
        int cnt=0, ans = 0, length=arr.length;
        int[] mark = new int[length];
        for(int i=0;i<length;i++){
            mark[i] = -1;
        }
        for(int i=0;i<length;i++){
            int pos = arr[i]-1;
            int L =pos, R=pos;
            mark[pos] = pos;
            if(pos>0 && mark[pos-1]!=-1){
                if(pos-1-mark[pos-1]+1==m){
                    cnt--;
                }
                L=mark[pos-1];
            }
            if(pos+1<length && mark[pos+1]!=-1){
                if(mark[pos+1]-pos-1 +1==m){
                    cnt--;
                }
                R=mark[pos+1];
            }
            mark[L] = R;
            mark[R] = L;
            if(R-L+1==m){
                cnt++;
            }
            if(cnt>0){
                ans = i+1;
            }
        }
        return ans==0?-1:ans;
    }
}
