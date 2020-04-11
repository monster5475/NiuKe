package com.likou.Code1_40;

/**
 * @author: wyh
 * k个一组翻转链表
 * @Day: 2020/3/28
 */
public class Code25 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode node = head;
        while(node!=null){
            length+=1;
            node = node.next;
        }
        ListNode myhead = new ListNode(-1);
        myhead.next = head;
        int num = length/k;
        ListNode thead = myhead;
        for(int i=0;i<num; i++){
            ListNode middle = thead.next;
            ListNode right = middle.next;
            for(int j=1;j<k;j++){
                node = right.next;
                right.next = thead.next;
                thead.next = right;
                middle.next = node;
                right = node;
            }
            thead = middle;
        }
        return myhead.next;
    }
}
