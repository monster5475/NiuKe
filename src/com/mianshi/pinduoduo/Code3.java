package com.mianshi.pinduoduo;

import java.util.*;

/**
 * @author: wyh
 * @Day: 2020/4/10
 */
public class Code3 {
    public static class TNUM{
        public int ind;
        public int cost;
        public int[] cc;
        public TNUM(int ind, int[] cc,int cost){
            this.ind = ind;
            this.cc = cc;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String number = scanner.next();
        int[] numbers = new int[10];
        for(int i=0;i<n;i++){
            int index = number.charAt(i)-'0';
            numbers[index]+=1;
        }
        int cost=0;
        boolean flag = false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=k){
                flag=true;
                break;
            }
        }
        if(flag){
            cost = 0;
        }else{
            cost = Integer.MAX_VALUE;
            List<TNUM> array = new ArrayList<>();
            int minCost=Integer.MAX_VALUE;
            for(int i=0;i<10;i++){
                int tcost=0;
                int s = numbers[i];
                int t=1;
                int c=1;
                int[] cc = new int[10];
                while(s<k){
                    int newIndex = i+c*t;
                    if(newIndex>=0&&newIndex<10) {
                        if(s+numbers[newIndex]<k){
                            cc[newIndex] = numbers[newIndex];
                            tcost+=cc[newIndex]*c;
                        }else{
                            cc[newIndex] = k-s;
                            tcost+=cc[newIndex]*c;
                        }
                        s += numbers[newIndex];
                    }
                    if(t==1){
                        t=-1;
                    }else{
                        t=1;
                        c+=1;
                    }
                }
                minCost = Math.min(minCost, tcost);
                array.add(new TNUM(i, cc,tcost));
            }
            ArrayList<TNUM> arrayList = new ArrayList<>();
            for(int i=0;i<array.size();i++){
                if(array.get(i).cost==minCost){
                    arrayList.add(array.get(i));
                }
            }
            cost = minCost;
            for(int i=0;i<arrayList.size();i++){
                HashMap<Integer, Integer> hashMap = new HashMap<>();
                TNUM tnum = arrayList.get(i);
                int[] cc = tnum.cc;
                int ff=-1,l=-1;
                for(int j=0;j<cc.length;j++){
                    if(cc[j]!=0) {
                        hashMap.put(j, tnum.ind);
                        if(cc[j]!=numbers[j]){
                            ff = j;
                            l = cc[j];
                        }
                    }
                }
                for(Map.Entry entry:hashMap.entrySet()){
                    Integer key = (Integer) entry.getKey();
                    Integer value = (Integer) entry.getValue();
                    if(key!=ff) {
                        number = number.replaceAll(String.valueOf(key), String.valueOf(value));
                    }else{
                        for(int j=0;j<number.length();j++){
                            int in = number.indexOf(String.valueOf(ff));
                            if(in!=-1) {
                                String left = number.substring(0, in);
                                String right = number.substring(in + 1, number.length());
                                number = left+value+right;
                                l-=1;
                            }
                            if(l==0){
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cost);
        System.out.println(number);
        scanner.close();
    }
}
