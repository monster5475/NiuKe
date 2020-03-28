package com.mianshi.zijietiaodong.bishi;

import java.util.*;

/**
 * @author: wyh
 * @Day: 2020/3/15
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String , ArrayList<String>> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            String ss = scanner.next();
            String str = scanner.next();
            if(hash.containsKey(str)){
                ArrayList<String> array = hash.get(str);
                array.add(ss);
            }else{
                ArrayList<String> array = new ArrayList<>();
                array.add(ss);
                hash.put(str, array);
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator iterator = hash.keySet().iterator();
        while(iterator.hasNext()){
            String key = (String)iterator.next();
            ArrayList<String> value = hash.get(key);
            Collections.sort(value);
            String res = key;
            for(int i=0;i<value.size();i++){
                res+= " "+ value.get(i);
            }
            arrayList.add(res);
        }
//        Collections.sort(arrayList, (str1, str2)->{
//            String[] ss1 =str1.split(".txt");
//            String[] ss2 =str2.split(".txt");
//            return Integer.valueOf(ss1[0])-Integer.valueOf(ss2[0])>0?-1:1;
//        });
        Collections.sort(arrayList);
        arrayList.stream().forEach(System.out::println);
        scanner.close();
    }
}
