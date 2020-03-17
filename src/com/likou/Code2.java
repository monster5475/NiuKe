package com.likou;

/**
 * @author: wyh
 * 两数相加
 * @Day: 2020/3/12
 */
public class Code2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int sum;
        int temp = 0;
        ListNode ln = head;
        while(l1!=null && l2!=null){
            ListNode node = new ListNode(0);
            sum = l1.val+l2.val+temp;
            if(sum>=10){
                sum%=10;
                temp=1;
            }else{
                temp = 0;
            }
            node.val = sum;
            ln.next = node;
            ln = ln.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            ListNode node = new ListNode(0);
            sum = l1.val + temp;
            if(sum>=10){
                sum%=10;
                temp=1;
            }else{
                temp = 0;
            }
            node.val = sum;
            ln.next = node;
            ln = ln.next;
            l1=l1.next;
        }
        while(l2!=null){
            ListNode node = new ListNode(0);
            sum = l2.val + temp;
            if(sum>=10){
                sum%=10;
                temp=1;
            }else{
                temp = 0;
            }
            node.val = sum;
            ln.next = node;
            ln = ln.next;
            l2=l2.next;
        }
        if(temp==1){
            ListNode node = new ListNode(1);
            ln.next = node;
        }
        return head.next;
    }
}
