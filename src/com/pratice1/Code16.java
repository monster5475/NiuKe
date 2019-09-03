package com.pratice1;

/**
 * @author: wyh
 * 合并两个排序的链表
 * @Day: 2019/9/3
 */
public class Code16 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode root = new ListNode(0);
        ListNode head = root;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                root.next = list1;
                root = list1;
                list1 = list1.next;
            }else{
                root.next = list2;
                root = list2;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            root.next = list1;
        }
        if(list2!=null){
            root.next = list2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Code16 myMain = new Code16();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode3;
        listNode3.next = listNode5;
        ListNode listNode2 = new ListNode(2);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode6 = new ListNode(6);
        listNode2.next = listNode4;
        listNode4.next = listNode6;
        myMain.Merge(listNode1,listNode2);
    }
}
