package com.likou.Code1_40;

/**
 * @author: wyh
 * @Day: 2020/3/26
 */
public class Code21 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while(l1!=null&&l2!=null){
            ListNode node = new ListNode(0);
            if(l1.val> l2.val){
                node.val = l2.val;
                l2 = l2.next;
            }else{
                node.val = l1.val;
                l1 = l1.next;
            }
            p.next = node;
            p = node;
        }
        while(l1!=null){
            ListNode node = new ListNode(0);
            node.val = l1.val;
            p.next = node;
            p = node;
            l1= l1.next;
        }
        while(l2!=null){
            ListNode node = new ListNode(0);
            node.val = l2.val;
            p.next = node;
            p = node;
            l2 = l2.next;
        }
        return head.next;
    }
}
