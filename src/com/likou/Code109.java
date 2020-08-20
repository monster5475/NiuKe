package com.likou;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author wyh
 * @Description 重建二叉平衡树
 * @Date: 2020 08 18 下午4:56
 */
public class Code109 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

    public static TreeNode rebuildTree(int[] nums){
        int length = nums.length;
        if(length==0){
            return null;
        }else if(length==1){
            TreeNode treeNode = new TreeNode(nums[0]);
            return treeNode;
        }
        int middle = length/2;
        int[] leftNum = Arrays.copyOfRange(nums, 0, middle);
        int[] rightNum = Arrays.copyOfRange(nums, middle+1, nums.length);
        TreeNode node = new TreeNode(nums[middle]);
        TreeNode left = rebuildTree(leftNum);
        TreeNode right = rebuildTree(rightNum);
        node.left = left;
        node.right = right;
        return node;
    }

    public static TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            arrayList.add(node.val);
            node = node.next;
        }
        int[] nums = arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return rebuildTree(nums);
    }

}
