package com.pratice1;

import java.util.Stack;

/**
 * @author: wyh
 * 反转链表
 * @Day: 2019/9/3
 */
public class Code15 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode root = null;
        if(!stack.isEmpty()){
            root = new ListNode(stack.pop());
        }
        ListNode newHead = root;
        while(!stack.isEmpty()){
            ListNode node = new ListNode(stack.pop());
            root.next = node;
            root = node;
        }
        return newHead;
    }
}
