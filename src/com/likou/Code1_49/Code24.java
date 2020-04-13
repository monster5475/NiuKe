package com.likou.Code1_49;

/**
 * @author: wyh
 * 两两交换链表中的节点
 * @Day: 2020/3/28
 */
public class Code24 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode myhead = new ListNode(-1);
        myhead.next = head;
        ListNode left,middle,right,node;
        left = myhead;
        while(true) {
            middle = left.next;
            if (middle == null) {
                break;
            }
            right = middle.next;
            if(right == null){
                break;
            }
            node = right.next;
            left.next = right;
            right.next = middle;
            middle.next = node;
            left = middle;
        }
        return myhead.next;
    }
}
