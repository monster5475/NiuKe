package com.pratice2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: wyh
 * a/b
 * @Day: 2020/3/7
 */
public class Code30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if(a%b==0){
            System.out.println(a/b);
        }else{
            LinkedHashMap<Integer, Integer> hs = new LinkedHashMap<>();
            String str_zs = "0";
            String str_xs = "";
            String str_xs_xh = "";
            if(a>b){
                str_zs = String.valueOf(a/b);
                a = a%b;
            }
            while(a<b){
                a*=10;
                int t =a/b;
                if(a%b==0){
                    Iterator iter = hs.entrySet().iterator();
                    while (iter.hasNext()){
                        Map.Entry entry = (Map.Entry) iter.next();
                        Integer val = (Integer)entry.getValue();
                        str_xs+=val;
                    }
                    str_xs+=t;
                    break;
                }
                int c = a/10;
                if(hs.containsKey(c)){
                    Iterator iter = hs.entrySet().iterator();
                    boolean flag = false;
                    while (iter.hasNext()){
                        Map.Entry entry = (Map.Entry) iter.next();
                        Integer key = (Integer) entry.getKey();
                        Integer val = (Integer)entry.getValue();
                        if(flag||key==c){
                            str_xs_xh+=val;
                            flag =true;
                        }else {
                            str_xs += val;
                        }
                    }
                    break;
                }
                hs.put(c, t);
                a = a%b;
            }
            if(str_xs_xh!=""){
                str_xs = str_xs+"("+str_xs_xh+")";
            }
            String result = str_zs + "." + str_xs;
            System.out.println(result);
        }
        scanner.close();
    }
}
