package com.likou;

/**
 * @Author wyh
 * @Description 判断奇数 偶数数量
 * @Date: 2020 08 05 下午9:59
 */
public class Code1217 {
    public static int minCostToMoveChips(int[] chips) {
        int length=chips.length;
        int odd=0,elod=0;
        for(int i=0;i<length;i++ ){
            if(chips[i]%2==0){
                odd+=1;
            }else{
                elod+=1;
            }
        }
        return Math.min(odd, elod);
    }

}
