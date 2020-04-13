package com.likou.Code1_49;

/**
 * @author: wyh
 * 删除链表倒数第n个节点
 * @Day: 2020/3/24
 */
public class Code19 {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode myHead = new ListNode(-1);
        myHead.next = head;
        ListNode t = head;
        int i=0;
        ListNode node = head;
        ListNode parent = myHead;
        while(node!=null){
            node=node.next;
            i++;
            if(i>n){
                parent = parent.next;
                t= t.next;
            }
        }
        parent.next = t.next;
        return myHead.next;
    }
}
