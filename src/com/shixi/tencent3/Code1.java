package com.shixi.tencent3;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/26
 */
public class Code1 {
    static class MyQueue{
        public QueueNode myhead;
        public int mysize;
        public QueueNode mytail;
        class QueueNode{
            public int value;
            public QueueNode next;
            public QueueNode(int val ){
                this.value = val;
                this.next =null;
            }
        }
        public MyQueue(){
            this.myhead = null;
            this.mysize=0;
            this.mytail = null;
        }
        public void mypush(int val){
            QueueNode node= new QueueNode(val);
            if(mysize==0){
                this.myhead = node;
                this.mytail = node;
                this.mysize+=1;
            }else{
                mytail.next = node;
                mytail = node;
                this.mysize+=1;
            }
        }
        public int mytop(){
            if(myhead!=null) {
                return myhead.value;
            }else{
                return -1;
            }
        }
        public int mypop(){
            if(myhead==null&&mytail==null){
                return -1;
            }
            int val = this.myhead.value;
            if(this.myhead==this.mytail){
                this.myhead=null;
                this.mytail=null;
                this.mysize-=1;
            }else {
                this.myhead = this.myhead.next;
                this.mysize-=1;
            }
            return val;
        }
        public int mysize(){
            return this.mysize;
        }
        public void myclear(){
            this.myhead = null;
            this.mysize=0;
            this.mytail = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<n;i++){
            MyQueue myQueue = new MyQueue();
            int m = Integer.valueOf(scanner.nextLine());
            String s = "";
            for(int j=0;j<m;j++){
                s = scanner.nextLine();
                if(s.contains("TOP")){
                    System.out.println(myQueue.mytop());
                }else if(s.contains("POP")){
                    int res = myQueue.mypop();
                    if(res==-1){
                        System.out.println(res);
                    }
                }else if(s.contains("SIZE")){
                    System.out.println(myQueue.mysize());
                }else if(s.contains("CLEAR")){
                    myQueue.myclear();
                }else if(s.contains("PUSH")){
                    String[]ss = s.split(" ");
                    myQueue.mypush(Integer.valueOf(ss[1]));
                }
            }
        }
        scanner.close();
    }
}
