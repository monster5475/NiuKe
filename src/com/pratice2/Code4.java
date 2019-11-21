package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2019/11/21
 */
public class Code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char[] dirs = {'N', 'E', 'S', 'W'};
        String operations = scanner.next();
        int index =0;
        for(int i=0; i<number; i++){
            if(operations.charAt('i') == 'L'){
                index-=1;
            }else{
                index+=1;
            }
            if(index==-1){index=3;}
            if(index==4){index=0;}
        }
        System.out.println(dirs[index]);
        scanner.close();
    }
}
