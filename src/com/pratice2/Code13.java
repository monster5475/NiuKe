package com.pratice2;

import java.util.*;

/**
 *
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code13 {

    public static class MyAction{
        public int number;
        public int index;
        public MyAction(int number, int index){
            this.number = number;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        List<MyAction> myActions = new ArrayList<>();
        List<String> actions = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = scanner.nextInt();
            myActions.add(new MyAction(num, i+1));
        }
        Comparator<MyAction> comparator = (a,b)->{
            if(a.number>b.number){
                return 1;
            }else if(a.number == b.number){
                return a.index>b.index?1:-1;
            }else{
                return -1;
            }
        };
        Collections.sort(myActions, comparator);
        int cnt =0;
        while(myActions.get(n-1).number-myActions.get(0).number>1&&cnt<k){
            MyAction max = myActions.get(n-1);
            MyAction min = myActions.get(0);
            actions.add(max.index + " "+ min.index);
            max.number -=1;
            min.number +=1;
            Collections.sort(myActions, comparator);
            cnt++;
        }
        int ds = myActions.get(n-1).number-myActions.get(0).number;
        System.out.println(ds + " " + cnt);
        actions.stream().forEach(System.out::println);
        scanner.close();
    }
}
