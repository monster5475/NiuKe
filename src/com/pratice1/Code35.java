package com.pratice1;

import java.util.Stack;

/**
 * @author: wyh
 * 两个链表的第一个公共结点
 * @Date: 2019/9/16 16:52
 */
public class Code35 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while(pHead1!=null){
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2!=null){
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode result = null;
        while(!stack1.isEmpty()&&!stack2.isEmpty()){
            if(stack1.peek().equals(stack2.peek())){
                ListNode node1 = stack1.pop();
                stack2.pop();
                result = node1;
            }else{
                break;
            }
        }
        return result;
    }
}
