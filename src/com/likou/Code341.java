package com.likou;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author wyh
 * @Description 迭代器设计 注意 这方面的思路
 * @Date: 2020 08 21 上午11:02
 */
public class Code341 {
    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     *
     *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     *     public boolean isInteger();
     *
     *     // @return the single integer that this NestedInteger holds, if it holds a single integer
     *     // Return null if this NestedInteger holds a nested list
     *     public Integer getInteger();
     *
     *     // @return the nested list that this NestedInteger holds, if it holds a nested list
     *     // Return null if this NestedInteger holds a single integer
     *     public List<NestedInteger> getList();
     * }
     */
    public class NestedInteger{
        public boolean isInteger(){return true;}
        public int getInteger(){return 0;}
        public List<NestedInteger> getList(){return new ArrayList<>();}
    }
    public class NestedIterator implements Iterator<Integer> {

        private List<Integer> arraylist;
        private int index;

        public void add(List<NestedInteger> nestedList){
            for(NestedInteger ni: nestedList){
                if(ni.isInteger()){
                    arraylist.add(ni.getInteger());
                }else{
                    add(ni.getList());
                }
            }
        }

        public NestedIterator(List<NestedInteger> nestedList) {
            arraylist = new ArrayList<>();
            add(nestedList);
            index=0;
        }

        @Override
        public Integer next() {
            return arraylist.get(index++);
        }

        @Override
        public boolean hasNext() {
            return index<arraylist.size();
        }
    }

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
