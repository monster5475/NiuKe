package com.pratice1;

/**
 * @author: wyh
 * 返回链表倒数第k个结点
 * @Day: 2019/9/3
 */
public class Code14 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return null;
        }
        ListNode des = head;
        while(k!=0 && des!=null){
            des = des.next;
            k--;
        }
        if(des == null && k!=0){
            return null;
        }
        while(des!=null){
            head = head.next;
            des = des.next;
        }
        return head;
    }
}
