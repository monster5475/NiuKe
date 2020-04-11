package com.likou.Code1_40;

/**
 * @author: wyh
 * 合并k个链表
 * @Day: 2020/3/28
 */
public class Code23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode node = head;
        int index=0;
        int length = lists.length;
        if(length==0){
            return head.next;
        }else if(length ==1){
            head.next = lists[0];
        }
        while(index!=length-1){
            index=0;
            int min = Integer.MAX_VALUE;
            int j=-1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]==null){
                    index++;
                }else{
                    if(lists[i].val<min){
                        min = lists[i].val;
                        j = i;
                    }
                }
            }
            if(index==length){
                break;
            }
            node.next = lists[j];
            node = lists[j];
            lists[j] = node.next;
        }
        return head.next;
    }
}
