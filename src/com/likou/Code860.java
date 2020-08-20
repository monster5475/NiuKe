package com.likou;

import java.util.HashMap;

/**
 * @Author wyh
 * @Description 水题
 * @Date: 2020 08 18 下午5:14
 */
public class Code860 {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(5,0);
        hashMap.put(10,0);
        for (int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                hashMap.put(5, hashMap.get(5) +1 );
            }else if(bills[i]==10){
                int number = hashMap.get(5);
                if(number==0){
                    return false;
                }else{
                    hashMap.put(5,number-1);
                }
                hashMap.put(10, hashMap.get(10)+1);
            }else{
                if(hashMap.get(10)>0){
                    hashMap.put(10,hashMap.get(10)-1);
                    if(hashMap.get(5)>0){
                        hashMap.put(5, hashMap.get(5)-1);
                    }else {
                        return false;
                    }
                }else if(hashMap.get(5)>=3){
                    hashMap.put(5, hashMap.get(5)-3);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
