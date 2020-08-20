package com.likou;

/**
 * @Author wyh
 * @Description 四因数
 * @Date: 2020 08 14 下午8:12
 */
public class Code1390 {
    public static int divide(int number){
        int cnt =0;
        int temp =0;
        for(int i=2; i<=Math.sqrt(number);i++){
            if(number%i==0){
                cnt+=1;
                temp = i;
            }
        }
        if(cnt==1){
            return temp;
        }else {
            return 0;
        }
    }

    public static int sumFourDivisors(int[] nums) {
        int left,right;
        int sum=0;
        for(int num: nums){
            if((left= divide(num))!=0){
                right = num/left;
                if(left!=right){
                    sum+=1;
                    sum+=num;
                    sum+=left;
                    sum+=right;
                }
            }
        }
        return sum;
    }

}
