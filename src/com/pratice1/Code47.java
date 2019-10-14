package com.pratice1;

/**
 * @author: wyh
 * 把字符串换成整数
 * @Date: 2019/9/21 14:48
 */
public class Code47 {
    public int StrToInt(String str) {
        boolean flag = true;
        int sign = 1, begin=0;
        int length = str.length();
        if(length==0){
            return 0;
        }
        if(str.charAt(0)=='-'){
            sign=-1;
            begin++;
        }else if(str.charAt(0)=='+'){
            sign =1;
            begin++;
        }
        int[] numbers = new int[length];
        int index=0;
        for(int i=begin; i<length; i++){
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }else if(ch>= '0' && ch<='9') {
                numbers[index++] = str.charAt(i) - '0';
            }else{
                flag = false;
                break;
            }
        }
        if(flag==false){
            return 0;
        }else {
            int sum=0;
            for(int i=index-1;i>=0;i--){
                sum+= numbers[i]*Math.pow(10,index-1-i)*sign;
            }
            return sum;
        }
    }
}
