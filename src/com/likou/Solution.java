package com.likou;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Solution {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode listNode1 = new ListNode(1);

        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode head = reverseKGroup(listNode1, 3);
        scanner.close();
    }
}
