package com.likou;

/**
 * @author: wyh
 * 倒数第k个结点
 * @Day: 2020/9/10
 */
public class Code1682 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static int kthToLast(ListNode head, int k) {
        ListNode p=head;
        while(k>0){
            k-=1;
            p=p.next;
        }
        ListNode q = head;
        while (p!=null){
            p=p.next;
            q=q.next;
        }
        return q.val;
    }
}
