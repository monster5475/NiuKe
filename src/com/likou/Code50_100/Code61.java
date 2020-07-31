package com.likou.Code50_100;

/**
 * @author: wyh
 * 旋转链表
 * @Day: 2020/4/21
 */
public class Code61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode node = head;
        int length=0;
        ListNode p =null;
        while(node!=null){
            p=node;
            node = node.next;
            length+=1;
        }
        if(length==0){
            return null;
        }
        p.next = head;
        int cnt = length-(k%length);
        node = head;
        while (cnt>0){
            cnt-=1;
            p = node;
            node = node.next;
        }
        p.next = null;
        head = node;
        return head;
    }
}
