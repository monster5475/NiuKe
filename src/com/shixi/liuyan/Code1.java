package com.shixi.liuyan;

/**
 * @Author wyh
 * @Description
 * @Date: 2020 08 15 下午7:18
 */
public class Code1 {
    public static void main(String[] args) {
        int n=4,m=5;
        int[][] nums = new int[n][m];
        int[][] maxNum = new int[m][2];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                int max = Math.max(maxNum[i][0], nums[j][i]);
                int min = Math.min(maxNum[i][0], nums[j][i]);
                int max_ = Math.max(min, maxNum[i][1]);
                maxNum[i][0] = max;
                maxNum[i][1] = max_;
            }
        }
        int s =0;
        for(int i=0;i<m;i++){
            s = Math.max(s, maxNum[i][0]*maxNum[i][1]);
        }
        System.out.println(s);
    }
}
