package com.shixi.kuaishouA;


import java.util.*;

/**
 * @author: wyh
 * @Day: 2020/3/22
 */
public class CodeC {
    public static class PhoneNumber {
        public String number;
        public int index;
        public boolean baozi;
        public int baozi_;
        public boolean shunzi;
        public int shunzi_;
        // 哪个更重要 1代表豹子，-1代表顺子
        public int important;
        public int value;

        public boolean countShow(){
            if(shunzi == false && baozi == false){
                return false;
            }else{
                if(shunzi == true && baozi == true){
                    if(shunzi_>baozi_){
                        important = -1;
                        value = shunzi_;
                    }else{
                        value = baozi_;
                        important = 1;
                    }
                }else{
                    if(shunzi == true){
                        important = -1;
                        value = shunzi_;
                    }
                    if(baozi == true){
                        important = 1;
                        value = baozi_;
                    }
                }
                return true;
            }
        }

        public void countBaozi(){
            int[] array = new int[8];
            array[0]=1;
            for(int i=4;i<11;i++){
                int j = i-3;
                if(number.charAt(i) == number.charAt(i-1)){
                    array[j] = array[j-1]+1;
                }else{
                    array[j] =1;
                }
            }
            int max=0;
            for(int i=0;i<8;i++){
                if(array[i]>=3){
                    this.baozi = true;
                    max = Math.max(max, array[i]);
                }
            }
            this.baozi_ = max;
        }

        public void countShunzi(){
            int[] array = new int[8];
            array[0] =1;
            for(int i=4; i<11;i++){
                int j = i-3;
                if(number.charAt(i) - number.charAt(i-1) ==1){
                    array[j] = array[j-1]+1;
                }else{
                    array[j] =1;
                }
            }
            int max = 0;
            for(int i=0;i<8;i++){
                if(array[i]>=3){
                    this.shunzi = true;
                    max = Math.max(max, array[i]);
                }
            }
            this.shunzi_ = max;
        }

        public PhoneNumber(int index, String number){
            this.index = index;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(",");
        int length = strs.length;
        PhoneNumber[] phoneNumber = new PhoneNumber[length];
        for(int i=0;i<length;i++){
            phoneNumber[i] = new PhoneNumber(i, strs[i]);
        }
        List<PhoneNumber> phoneNumberList = new LinkedList<>();
        for(int i=0;i<length;i++){
            phoneNumber[i].countBaozi();
            phoneNumber[i].countShunzi();
            if(phoneNumber[i].countShow()){
                phoneNumberList.add(phoneNumber[i]);
            }
        }
        if(phoneNumberList.isEmpty()){
            System.out.println("null");
            return;
        }
        Collections.sort(phoneNumberList,(PhoneNumber o1, PhoneNumber o2)->{
            int o1_=1, o2_=-1, o3_=0;
            if(o1.value>o2.value){
                return o2_;
            }else if(o1.value == o2.value){
                if(o1.important ==1 && o2.important==1){
                    if(o1.index>o2.index){
                        return o1_;
                    }else {
                        return o3_;
                    }
                }else if(o1.important ==-1 && o2.important==-1){
                    if(o1.index>o2.index){
                        return o1_;
                    }else {
                        return o3_;
                    }
                }else if(o1.important ==1 && o2.important==-1){
                    return o2_;
                }else{
                    return o1_;
                }
            }else{
                return o1_;
            }
        });
        String res = "";
        for(int i=0;i<phoneNumberList.size();i++){
            res += phoneNumberList.get(i).number + ",";
        }
        res = res.substring(0, res.length()-1);
        System.out.println(res);
        scanner.close();
    }
}
