package com.pratice1;

import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */


public class MyMain {

    public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
    this.val = val;

    }

    }

    Boolean flag = true;

    public int TreeTravel(TreeNode node, int depth){
        int leftDepth=0,rightDepth=0;
        if(node.left!=null){
            leftDepth = TreeTravel(node.left, depth+1);
        }
        if(node.right!=null){
            rightDepth = TreeTravel(node.right, depth+1);
        }
        if(Math.abs(leftDepth-rightDepth)<=1 && flag){
            flag = false;
        }
        return leftDepth>rightDepth?leftDepth:rightDepth;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        int depth = 1;
        TreeTravel(root, depth);
        return flag;
    }

    public static void main(String[] args) {
        MyMain myMain =new MyMain();
        int[] array = {1,3,2,4,5,6,7,0};
        int begin = myMain.TreeDepth(array);
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(myMain.sum);
    }
}
