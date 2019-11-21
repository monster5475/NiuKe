package com.pratice1;

/**
 * @author: wyh
 * 剪绳子
 * @Date: 2019/10/13 10:30
 */
public class Code50 {
    public int cutRope(int target) {
        double sNum = Math.sqrt(target);
        double upNum = Math.ceil(sNum);
        double downNum = Math.floor(sNum);
        double sum = 0, res;
        if(upNum!=target) {
            if (target % upNum == 0) {
                res = Math.pow(upNum, target / upNum);
            } else {
                int tnum = (int) upNum;
                res = Math.pow(upNum, target / tnum) * (target % tnum);
            }
            sum = res>sum?res:sum;
        }
        if(target%downNum==0){
            res = Math.pow(downNum, target/downNum);
        }else {
            int tnum = (int) downNum;
            res = Math.pow(downNum, target/tnum) * (target%tnum);
        }
        sum = res>sum?res:sum;
        return (int)sum;
    }
}
