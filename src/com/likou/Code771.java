package com.likou;

/**
 * @Author wyh
 * @Description 水题 统计数量
 * @Date: 2020 08 08 下午11:39
 */
public class Code771 {
    public static int numJewelsInStones(String J, String S) {
        int length = S.length();
        int cnt = 0;
        for(int i=0; i<length;i++){
            String ts = String.valueOf(S.charAt(i));
            if(J.contains(ts)){
                cnt+=1;
            }
        }
        return cnt;
    }
}
